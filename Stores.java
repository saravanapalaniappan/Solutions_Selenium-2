package com.htc.Qsn1and2;

import java.util.ArrayList;
import java.util.Collections;

public class Stores {
	private ArrayList<Product> productList;
	

	public Stores(ArrayList<Product> productList) {
		super();
		this.productList = productList;
	}
	
	public ArrayList<Product> getProductList(){
		return productList;
		}
	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "Stores [productList=" + productList + "]";
	}
	//Sell Method
	public double SellItem(int productCode, int qtyRequired) throws ProductNotFoundException,InsufficientQuantityException
	{
		int f=1;
		double cost = 0;
		for(Product prod1: productList)
		{
		 if(prod1.getProductId() ==productCode)
		  {
			f=0;
			 if(prod1.getQuantityOnHand() < qtyRequired)
				throw new InsufficientQuantityException();
			else
			{
				cost=prod1.getPrice()*qtyRequired;
				prod1.setQuantityOnHand(prod1.getQuantityOnHand() - qtyRequired);
				
				if(prod1.getQuantityOnHand() <=10)
					System.out.println("purchase order is made");
			}
		  }
			 
		}
		if(f==1)
		throw new ProductNotFoundException();
	return cost;
	}

//Update stock Method
	public void updateStock(int ProdId, int qtyRequired) throws ProductNotFoundException
	{
		for(Product prod1: productList){
		if(prod1.getProductId() !=ProdId)
			throw new ProductNotFoundException();
		else
			prod1.setQuantityOnHand(prod1.getQuantityOnHand()+50);
			}
	
	}

//Main Method
	public static void main(String[] args)  
	  {
		
		
		
		
		ArrayList<Product> productList= new ArrayList<Product>();
		try
		{
		productList.add(new Product(101, 55, 20, 50,"pen",10));
		productList.add(new Product(102, 55, 20, 50,"pencil",5));
		productList.add(new Product(103, 55, 20, 50,"Book",20));
		productList.add(new Product(104, 55, 20, 50,"paper",2));
		productList.add(new Product(105, 55, 20, 50,"pin",1));
		
		Collections.sort(productList);
		for(Product prod1: productList)
		{
			System.out.println(prod1.getPrice());
		}
		
		Stores storobj=new Stores(productList);
		double amount=storobj.SellItem(105, 2);
		System.out.println("Cost of the item:"+amount);
		}	
		catch (InsufficientQuantityException iqe){
			System.out.println("Insufficient Quantity");
		}
		catch (ProductNotFoundException pnf){
			System.out.println("Produc tNot Found");
		}
		catch (Exception ex){
			System.out.println("exception");
	 }

	 }

}
