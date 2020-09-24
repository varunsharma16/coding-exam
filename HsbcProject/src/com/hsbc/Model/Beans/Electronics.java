package com.hsbc.Model.Beans;

public class Electronics extends Items{
	private int warranty;

	

	

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public Electronics(int itemcode, String name, int price, int quantity, int warranty) {
		super(itemcode, name, price, quantity);
		this.warranty = warranty;
	}

	public Electronics() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Electronics [warranty=" + warranty + ", getItemcode()=" + getItemcode() + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getQuantity()=" + getQuantity() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	

}
