package Storeapp;

public class ProductNotFoundException extends Exception{

	String errorMsg="Product Not Found !!";
	/**
	 * 
	 */
	public ProductNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public ProductNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return errorMsg;
	}

	
	

}
