package com.htc.coreJava2;

//import java.util.*;

public class Product implements Comparable<Product>{

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
		return "Product [productId=" + productId  +",\n productName=" + productName  +",\n price="  +price
				+ ",\n quantityOnHand=" + quantityOnHand + ",\n reorderLevel=" + reorderLevel  + ",\n reorderQty=" + reorderQty + "]";
	}



	public int compareTo(Product p) {
		// TODO Auto-generated method stub
		return (int) (this.getPrice()-p.getPrice()) ;
	}

	
	
}