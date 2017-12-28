package com.htc.coreJavaExam;

import java.util.ArrayList;
import java.util.List;

public class Stores {

	private ArrayList<Product> prod;
	
	public Stores() {
		
	}
	
	public Stores(ArrayList<Product> prod) {
		super();
		this.prod = prod;
	}

	public ArrayList<Product> getProd() {
		return prod;
	}

	public void setProd(ArrayList<Product> prod) {
		this.prod = prod;
	}
	
	
	
	@Override
	public String toString() {
		return "Stores [prod=" + prod + "]";
	}

	public double sellItem(int productCode,int qtyRequired) throws ProductNotFoundException,InsufficientQuantityException{
	
		double amount=0.0;
		boolean flag=false;
		for(Product prod1: prod) {
			if(prod1.getProductId()==productCode)
			{
				flag=true;
				if(qtyRequired<prod1.getQuantityOnHand())
				{
					amount=qtyRequired*prod1.getPrice();
					prod1.setQuantityOnHand(qtyRequired-prod1.getQuantityOnHand());
					if(prod1.getQuantityOnHand()<prod1.getReorderLevel())
						System.out.println("Purchase order is made");
						
					prod1.setReorderLevel(qtyRequired);
				}
				else
					throw new InsufficientQuantityException();
			}
			if(flag=false)
				throw new ProductNotFoundException();
			}
		
		return amount;
	}
	
	public void updateStock(int productCode,int arrivalQty) throws ProductNotFoundException{
		
	}
	
	public static void main(String[] args) {
		
		Product obj;
		
		
		ArrayList<Product> prod=new ArrayList<Product>();
		
		try {
			new Product();
			prod.add(new Product(100,"Soap",120.00,20));
			prod.add(new Product(101,"Towel",250.00,20));
			prod.add(new Product(102,"Drink",20.00,70));
			prod.add(new Product(103,"water",10.00,60));
			
			Stores obj1=new Stores(prod);
			
			double amount=obj1.sellItem(103, 30);
			System.out.println("Total Amount for selected product: " + amount);
		}
		catch (ProductNotFoundException PNFE)
		{
			System.out.println("The Product you are looking to buy is not available in the Store");
		}
		catch (InsufficientQuantityException IQE) {
		
			System.out.println("You have Requested more than available quantity");
		}
		catch (Exception ex) {
			System.out.println("in Main exception");
		}
		
	}
	
	
}
