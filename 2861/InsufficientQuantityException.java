package com.htc.product;

public class InsufficientQuantityException extends Exception {
	   private int quantityOnHand;
	   public InsufficientQuantityException(int quantityOnHand)
	   {
	      this.quantityOnHand = quantityOnHand;
	   } 
	   public int getquantityOnHand()
	   {
	      return -quantityOnHand;
	   }
}
