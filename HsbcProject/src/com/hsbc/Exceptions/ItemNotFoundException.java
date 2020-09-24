package com.hsbc.Exceptions;

public class ItemNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String error;
	public ItemNotFoundException(String error) {
	
		this.error = error;
	}
	public String  getMessage()
	{
		return error;
	}


	

}
