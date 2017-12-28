package com.htc.product;

//import java.util.Arrays;
import java.util.Comparator;

public class ComparatorProduct implements Comparator<Product> {


	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		if (p1.getPrice() < p2.getPrice()) return -1;
		if (p1.getPrice() > p2.getPrice()) return 1;
		return 0;
	}
}
