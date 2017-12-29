package com.htc.coreJava2;

import java.util.ArrayList;
import java.util.Collections;

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

		public double sellItem(int productCode,int qtyRequired){
		
			double amount=0.0;
		/*	for(Product prod1: prod) {
				if(prod1.getProductId()==productCode)
				{
					if(qtyRequired<prod1.getQuantityOnHand())
					{
						amount=qtyRequired*prod1.getPrice();
						prod1.setQuantityOnHand(qtyRequired-prod1.getQuantityOnHand());
						if(prod1.getQuantityOnHand()<prod1.getReorderLevel())
							System.out.println("Purchase order is made");
							
						prod1.setReorderLevel(qtyRequired);
					}
				}*/
			
			return amount; 
		}
		
		public void updateStock(int productCode,int arrivalQty){
			
		}
		
		public static void main(String[] args) {
			
		//	Product obj=new Product();
			
			ArrayList<Product> prod=new ArrayList<Product>();
				prod.add(new Product(1000,"Soap",120.00,20));
				prod.add(new Product(10,"Towel",250.00,20));
				prod.add(new Product(12,"Drink",20.00,70));
				prod.add(new Product(3,"water",10.00,60));
				
				Collections.sort(prod);
				for(Product product: prod) {
					System.out.println("Price:" +  product.getPrice() + "\n productName: "  + product.getProductName());
				}
		}
		
		
	}
