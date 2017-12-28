package com.htc.Qsn1and2;

 public class Product implements Comparable<Product>{ 
	 
int productId,quantityOnHand,oderLevel,reorderQty; 
String productName;

public Product(){}

public Product(int productId, int quantityOnHand, int oderLevel,
		int reorderQty, String productName, float price) 
{
	super();
	this.productId = productId;
	this.quantityOnHand = quantityOnHand;
	this.oderLevel = oderLevel;
	this.reorderQty = reorderQty;
	this.productName = productName;
	this.price = price;
}

@Override
public String toString() {
	return "Product [productId=" + productId + ", quantityOnHand="
			+ quantityOnHand + ", oderLevel=" + oderLevel + ", reorderQty="
			+ reorderQty + ", productName=" + productName + ", price=" + price
			+ "]";
}



public int getProductId() { 
return productId; 
} 
public void setProductId(int productId) { 
this.productId = productId; 
} 
	public int getQuantityOnHand() { 
			return quantityOnHand; 
		} 
		public void setQuantityOnHand(int quantityOnHand) { 
			this.quantityOnHand = quantityOnHand; 
	 	} 
	 	public int getOderLevel() { 
	 		return oderLevel; 
	 	} 
	 	public void setOderLevel(int oderLevel) { 
			this.oderLevel = oderLevel; 
	 	} 
		public int getReorderQty() { 
			return reorderQty; 
	 	} 
	 	public void setReorderQty(int reorderQty) { 
	 		this.reorderQty = reorderQty; 
	 	} 
	 	public String getProductName() { 
			return productName; 
		} 
	 	public void setProductName(String productName) { 
	 		this.productName = productName; 
	 	} 
		public float getPrice() { 
	 		return price; 
 	} 
	 	public void setPrice(float price) { 
			this.price = price; 
	 	} 
		float price;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + oderLevel;
			result = prime * result + Float.floatToIntBits(price);
			result = prime * result + productId;
			result = prime * result
					+ ((productName == null) ? 0 : productName.hashCode());
			result = prime * result + quantityOnHand;
			result = prime * result + reorderQty;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (oderLevel != other.oderLevel)
				return false;
			if (Float.floatToIntBits(price) != Float
					.floatToIntBits(other.price))
				return false;
			if (productId != other.productId)
				return false;
			if (productName == null) {
				if (other.productName != null)
					return false;
			} else if (!productName.equals(other.productName))
				return false;
			if (quantityOnHand != other.quantityOnHand)
				return false;
			if (reorderQty != other.reorderQty)
				return false;
			return true;
		}

		@Override
		public int compareTo(Product o) {
			return (int) (this.getPrice()-o.price);
		
		} 
	 } 


