package Storeapp;

public class Product {

	private String productId;
	private String productName;
	private double price;
	private int quantityOnHand;
	private static int reorderLevel=10;
	private static int reorderQty=50;
	
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the quantityOnHand
	 */
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	/**
	 * @param quantityOnHand the quantityOnHand to set
	 */
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	/**
	 * @return the reorderLevel
	 */
	public int getReorderLevel() {
		return reorderLevel;
	}
	/**
	 * @param reorderLevel the reorderLevel to set
	 */
	public void setReorderLevel(int reorderLevel) {
		Product.reorderLevel = reorderLevel;
	}
	/**
	 * @return the reorderQty
	 */
	public int getReorderQty() {
		return reorderQty;
	}
	/**
	 * @param reorderQty the reorderQty to set
	 */
	public void setReorderQty(int reorderQty) {
		Product.reorderQty = reorderQty;
	}
	
	public Product(String productId, String productName, double price, int quantityOnHand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantityOnHand=" + quantityOnHand + "]";
	}
	
	
	
}
