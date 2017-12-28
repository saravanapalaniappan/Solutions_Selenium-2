package com.htc.product;

public class ProductNotFoundException extends Exception{
		   private int productCode;
		   public ProductNotFoundException(int productCode)
		   {
		      this.productCode = productCode;
		   } 
		   public int getProductCode()
		   {
		      return productCode;
		   }
}
