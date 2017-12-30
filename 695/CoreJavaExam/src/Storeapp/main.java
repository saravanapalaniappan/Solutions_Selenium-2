package Storeapp;

import java.util.ArrayList;
import java.util.Collections;

import Storeapp.*;


public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		double totalAmt;
		
		Store store=new Store();
		ArrayList<Product> productlist=new ArrayList<Product>();
		
		productlist.add(new Product("001","Shampoo",20.00,100));
		productlist.add(new Product("002","Conditioner",15.00,100));
		productlist.add(new Product("003","Soap",10.00,100));
		productlist.add(new Product("004","Toothpaste",5.00,100));
		store.setStoreName("HTC Store");		
		store.setProductList(productlist);
		
		try {
			//Printing productlist before anything sold			
		//	System.out.println(store.getProductList().toString());
			
            System.out.println(	"ID "+ "  " +
					"Name"+ "  " +
					"Price"+ "  " +
					"Qty"+ "  " 
                   );
			
			for (Product p: productlist)
	            System.out.println(	p.getProductId()+ "  " +
	            					p.getProductName()+ "  " +
	            					p.getPrice()+ "  " +
	            					p.getQuantityOnHand()+ "  " 
	                               );

			System.out.print( "\n\n\n" );
			
			//Selling Item 001
			System.out.println("selling Item 001 of quantity 20");
			totalAmt= store.sellItem("001", 20);	
			System.out.println("total Amt sold:"+totalAmt);	
            System.out.println(	"ID "+ "  " +
					"Name"+ "  " +
					"Price"+ "  " +
					"Qty"+ "  " 
                   );
			
			for (Product p: productlist)
	            System.out.println(	p.getProductId()+ "  " +
	            					p.getProductName()+ "  " +
	            					p.getPrice()+ "  " +
	            					p.getQuantityOnHand()+ "  " 
	                               );

			System.out.print( "\n\n\n" );
			
			//Selling Item 002
			System.out.println("selling Item 002 of quantity 10");
			totalAmt= store.sellItem("002", 10);	
			System.out.println("total Amt sold:"+totalAmt);	
			//System.out.println(store.getProductList().toString());
			   System.out.println(	"ID "+ "  " +
						"Name"+ "  " +
						"Price"+ "  " +
						"Qty"+ "  " 
	                   );
				
				for (Product p: productlist)
		            System.out.println(	p.getProductId()+ "  " +
		            					p.getProductName()+ "  " +
		            					p.getPrice()+ "  " +
		            					p.getQuantityOnHand()+ "  " 
		                               );

			System.out.print( "\n\n\n" );
			
			//Checking Insufficient Quantity order 
			System.out.println("Checking Insufficient Quantity order by selling Item 003 quantity 192 ");
			totalAmt= store.sellItem("003", 192);
			System.out.println("total Amt sold:"+totalAmt);	
		//	System.out.println(store.getProductList().toString());
			   System.out.println(	"ID "+ "  " +
						"Name"+ "  " +
						"Price"+ "  " +
						"Qty"+ "  " 
	                   );
				
				for (Product p: productlist)
		            System.out.println(	p.getProductId()+ "  " +
		            					p.getProductName()+ "  " +
		            					p.getPrice()+ "  " +
		            					p.getQuantityOnHand()+ "  " 
		                               );

			System.out.print( "\n\n\n" );
			
			//Selling Item 1233 not found in store
			System.out.println("selling Item 1233 not found in store");
			totalAmt= store.sellItem("1233", 10);
			System.out.println("total Amt sold:"+totalAmt);	
		//	System.out.println(store.getProductList().toString());
			   System.out.println(	"ID "+ "  " +
						"Name"+ "  " +
						"Price"+ "  " +
						"Qty"+ "  " 
	                   );
				
				for (Product p: productlist)
		            System.out.println(	p.getProductId()+ "  " +
		            					p.getProductName()+ "  " +
		            					p.getPrice()+ "  " +
		            					p.getQuantityOnHand()+ "  " 
		                               );
		System.out.print( "\n\n\n" );
			
			
			//Checking reorderlevel when selling item 003 more than 90 
			System.out.println("Checking reorder level & update stock when item 004 is sold 92 and qty at hand less than 10");
			totalAmt= store.sellItem("004", 92);
			System.out.println("total Amt sold:"+totalAmt);	
	        System.out.println(	"Price "+ "  " +
						"ID"+ "  " +
						"Name"+ "  " +
						"Qty"+ "  " 
	                   );
		
			for (Product p: productlist)
	            System.out.println(	p.getPrice()+ " " +
	            				   	p.getProductId()+ " " +
	            					p.getProductName()+ " " +
	            					p.getQuantityOnHand()+ " " 
	                               );
			
			System.out.print( "\n\n\n" );
			
	/*		//updating stock for item not found in store
			System.out.println("Updating stock for item not found in store");
			store.updateStock("1233", 50);
			System.out.println(store.getProductList().toString());*/
			
			
			
			
			//Calling PriceCompare Comparator
			System.out.println( "Comparator Product and sorting items with respect to price" );
			PriceCompare pricecmp= new PriceCompare();
			Collections.sort(productlist, pricecmp);
			
			for (Product p: productlist)
	            System.out.println(	p.getPrice()+ " " +
	            				   	p.getProductId()+ " " +
	            					p.getProductName()+ " " +
	            					p.getQuantityOnHand()+ " " 
	                               );

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
