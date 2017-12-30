package Storeapp;

import java.util.Comparator;

import Storeapp.Product;


public class PriceCompare implements Comparator<Product>{
	
	public int compare(Product p1, Product p2)
	{
	   if (p1.getPrice()<p2.getPrice())  return -1;
	   if (p1.getPrice()>p2.getPrice())  return 1;	 
	   else return 0;
	}

}
