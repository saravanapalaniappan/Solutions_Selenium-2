package com.java.newproduct;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;



public class Stores {

 	static ArrayList<Product> listOfProduct = new ArrayList<Product>();

	public static void main(String[] args) {
		
		listOfProduct.add(new Product(101,"Toy Train",15.01,85));
		listOfProduct.add(new Product(102,"Action Figure",7.01,35));
		listOfProduct.add(new Product(103,"Teddy Bear",13.01,25));
		listOfProduct.add(new Product(104,"Doll",9.01,55));
		listOfProduct.add(new Product(105,"Ball",4.01,45));
				
		for (int i = 0; i < listOfProduct.size(); i++ ){
			System.out.println(listOfProduct.get(i));
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
		System.out.println();
		System.out.println();
		System.out.println("Starting Comparable logic for Question 2");
		System.out.println("Printing Data Before Sort");
		for (int i = 0; i < listOfProduct.size(); i++ ){
			System.out.println(listOfProduct.get(i));
		}
		 System.out.println("Now Printing Sorted by Price");
	     ComparatorProduct sortPrice = new ComparatorProduct();
	     Collections.sort(listOfProduct, sortPrice);
	     for (int i = 0; i < listOfProduct.size(); i++ ){
				System.out.println(listOfProduct.get(i));
			}
	}
	static double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException, InsufficientQuantityException{
		double total = 0.00;
		int procure = 0;
		boolean prodidfound = false; 
		for (int i = 0; i < listOfProduct.size(); i++) {
			if (productCode == listOfProduct.get(i).getProductId()) {
				prodidfound = true;
				total = listOfProduct.get(i).getPrice() * qtyRequired;
				procure = listOfProduct.get(i).getQuantityOnHand() - qtyRequired;
				if (procure < 0){
					throw new InsufficientQuantityException(procure);
				}
				else {
					listOfProduct.get(i).setQuantityOnHand(listOfProduct.get(i).getQuantityOnHand() - qtyRequired);
					if (listOfProduct.get(i).getQuantityOnHand() <= listOfProduct.get(i).getReorderLevel()) {
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
		for (int i = 0; i < listOfProduct.size(); i++) {
			if (productCode == listOfProduct.get(i).getProductId()) {
				prodidfound = true;
				int oldQty = listOfProduct.get(i).getQuantityOnHand();
				listOfProduct.get(i).setQuantityOnHand(listOfProduct.get(i).getQuantityOnHand() + arrivedQty);
				System.out.println("Stock for "+productCode+" updated from "+oldQty+" to "+ listOfProduct.get(i).getQuantityOnHand());
			}
		}
		if (prodidfound == false) {
			throw new ProductNotFoundException(productCode);
		}
		
	}
	

}
