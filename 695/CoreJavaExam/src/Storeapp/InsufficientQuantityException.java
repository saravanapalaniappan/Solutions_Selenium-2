package Storeapp;

public class InsufficientQuantityException extends Exception{

	String errorMsg="Insufficient Quantity!!";
	/**
	 * 
	 */
	public InsufficientQuantityException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public InsufficientQuantityException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return errorMsg;
	}

	
	

}
