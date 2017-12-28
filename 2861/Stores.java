package com.htc.product;

import java.util.Scanner;

public class Stores {

	public static Product[] listOfProduct = new Product[5];

	public static void main(String[] args) {
		
		listOfProduct[0] = new Product(101,"Toy Train",15.01,85);      
		listOfProduct[1] = new Product(102,"Action Figure",7.01,35);      
		listOfProduct[2] = new Product(103,"Teddy Bear",13.01,25);      
		listOfProduct[3] = new Product(104,"Doll",9.01,15);      
		listOfProduct[4] = new Product(105,"Ball",4.01,45);      
	
	    for (int i = 0; i < listOfProduct.length; i++){
            System.out.print(listOfProduct[i].getProductId()+",");
            System.out.print(listOfProduct[i].getProductName()+",");
            System.out.print(listOfProduct[i].getPrice()+",");
            System.out.print(listOfProduct[i].getQuantityOnHand()+",");
            System.out.print(listOfProduct[i].getReorderLevel()+",");
            System.out.print(listOfProduct[i].getReorderQty()+",");
            System.out.println();
	    }
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter Product code of item to be sold");
		int productCode = userinput.nextInt();
		System.out.println("Enter Quantity of item to be sold");
		int qtyRequired = userinput.nextInt();
		try {
			System.out.println("Total selling price of order is " + sellItem(productCode,qtyRequired));	
		}
		catch(ProductNotFoundException e){
			System.out.println("Product ID "+e.getProductCode() +" not found in list of Products available");
		}
		catch(InsufficientQuantityException e) {
			System.out.println("Please procure "+e.getquantityOnHand() +" more items to complete this order");
		}
		System.out.println("Enter Product code of stock to be updated");
		productCode = userinput.nextInt();
		System.out.println("Enter Quantity of items arrived");
		int arrivedQty = userinput.nextInt();
		try {
			updateStock(productCode,arrivedQty);
		}
		catch(ProductNotFoundException e){
			System.out.println("Product ID "+e.getProductCode() +" not found in list of Products available");
		}
		userinput.close();
	}
	static double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException, InsufficientQuantityException{
		double total = 0.00;
		int procure = 0;
		boolean prodidfound = false; 
		for (int i = 0; i < listOfProduct.length; i++) {
			if (productCode == listOfProduct[i].getProductId()) {
				prodidfound = true;
				total = listOfProduct[i].getPrice() * qtyRequired;
				procure = listOfProduct[i].getQuantityOnHand() - qtyRequired;
				if (procure < 0){
					throw new InsufficientQuantityException(procure);
				}
				else {
					listOfProduct[i].setQuantityOnHand(listOfProduct[i].getQuantityOnHand() - qtyRequired);
					if (listOfProduct[i].getQuantityOnHand() <= listOfProduct[i].getReorderLevel()) {
						System.out.println("purchase order is made");
					}
				}
				break;
			}
		}
		if (prodidfound == false) {
			throw new ProductNotFoundException(productCode);
		}
		return total;
	}
	static void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException{
		boolean prodidfound = false; 
		for (int i = 0; i < listOfProduct.length; i++) {
			if (productCode == listOfProduct[i].getProductId()) {
				prodidfound = true;
				int oldQty = listOfProduct[i].getQuantityOnHand();
				listOfProduct[i].setQuantityOnHand(listOfProduct[i].getQuantityOnHand() + arrivedQty);
				System.out.println("Stock for "+productCode+" updated from "+oldQty+" to "+ listOfProduct[i].getQuantityOnHand());
			}
		}
		if (prodidfound == false) {
			throw new ProductNotFoundException(productCode);
		}
		
	}

}
