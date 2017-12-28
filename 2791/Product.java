package com.htc.coreJavaExam2;

import java.io.*;
import java.util.*;

public class Product implements Comparator<Product>{

	private int productId;
	private String productName;
	private double price;
	private int quantityOnHand,reorderLevel,reorderQty;

	
	public Product() {
	}
	
	public Product(int productId, String productName, double price, int quantityOnHand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
		this.reorderLevel = 10;
		this.reorderQty = 50;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	public int getReorderLevel() {
		return reorderLevel;
	}
	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}
	public int getReorderQty() {
		return reorderQty;
	}
	public void setReorderQty(int reorderQty) {
		this.reorderQty = reorderQty;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantityOnHand=" + quantityOnHand + ", reorderLevel=" + reorderLevel + ", reorderQty=" + reorderQty
				+ "]";
	}

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		if(p1.getPrice()>p2.getPrice())
			return -1;
		else if(p1.getPrice()<p2.getPrice()) 
			return 1;
		else 
			return 0;
	}

	public double compare(Product p) {
		// TODO Auto-generated method stub
		return this.getPrice()-p.getPrice() ;
	}

	
	
}
