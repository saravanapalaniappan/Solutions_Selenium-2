package Storeapp;

import java.util.ArrayList;


public class Store extends Exception{
		
	private String storeName;	
	private ArrayList<Product> ProductList=new ArrayList<Product>();
	/**
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}
	/**
	 * @param storeName the storeName to set
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	/**
	 * @return the productList
	 */
	public ArrayList<Product> getProductList() {
		return ProductList;
	}
	/**
	 * @param productList the productList to set
	 */
	public void setProductList(ArrayList<Product> productList) {
		ProductList = productList;
	}
	/**
	 * @param storeName
	 * @param productList
	 */
	public Store(String storeName, ArrayList<Product> productList) {
		super();
		this.storeName = storeName;
		ProductList = productList;
	}
	/**
	 * 
	 */
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Store [storeName=" + storeName + ", ProductList=" + ProductList + "]\n";
	}
	
	public double sellItem(String productId, int qtyRequired) throws InsufficientQuantityException,ProductNotFoundException
		{
		
		double totalamtsold=0.00;
		int newquantity;
		boolean productfound=false;
		 for(Product p:ProductList){  
		     
			 
			 
			 try {
				if (p.getProductId().equals(productId))  
				    {
					 productfound=true;
				    	if (p.getQuantityOnHand()<qtyRequired)
				    	{
				    		throw new InsufficientQuantityException();
				    			        		
				    	}
				    	else
				    	{	
				    	newquantity=p.getQuantityOnHand()-qtyRequired;
				    	p.setQuantityOnHand(newquantity);
				    	totalamtsold=qtyRequired*(p.getPrice());		        	
				    	if (newquantity<=p.getReorderLevel())
				    	{
				    		
				    		System.out.println("Quantity left is "+ newquantity + " less than " +p.getReorderLevel()+" hence, purchase order is made");
				    		updateStock(productId,p.getReorderQty());
				    	}
				    			        			        	
				    }
				}
			} catch (InsufficientQuantityException e) {
				// TODO Auto-generated catch block
				System.out.println("Insufficient Quantity");
			} 
			 
		 }    
		 
		try {
			if (productfound == false) {
				throw new ProductNotFoundException();
				
			} 
		} catch (ProductNotFoundException e) {
			// TODO: handle exception
			System.out.println("Product Not Found");
		}
		return totalamtsold;
		 
		
	}
	
	public void updateStock(String productCode, int arrivedQty) 
			throws ProductNotFoundException
	{
		boolean productfound=false;
		int newstock=0;
		 for(Product p:ProductList){  
		     
			 if (p.getProductId().equals(productCode))  
		        {
				 productfound=true;
				 newstock=p.getQuantityOnHand()+arrivedQty;
				 p.setQuantityOnHand(newstock);
		        }
		 }
		 
		 if (productfound==false)
			{
				ProductNotFoundException PNF = new ProductNotFoundException();
	    		throw PNF;
			}
			 
	}
	
	
	
}	

	