package com.hsbc.Model.Beans;

public class FoodItems extends Items{
	
	private String dom;
	private String doe;
	private boolean vegetarian;
	
	
	public FoodItems() {
		super();
	}

	public FoodItems(int itemcode, String name, int price, String dom, String doe, boolean vegetarian,
			int quantity) {
		super(itemcode,name,price,quantity);
		
		this.dom = dom;
		this.doe = doe;
		this.vegetarian = vegetarian;
		
	}
	
	public String getDom() {
		return dom;
	}
	public void setDom(String dom) {
		this.dom = dom;
	}
	public String getDoe() {
		return doe;
	}
	public void setDoe(String doe) {
		this.doe = doe;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	@Override
	public String toString() {
		return "FoodItems [dom=" + dom + ", doe=" + doe + ", vegetarian=" + vegetarian + ", getItemcode()="
				+ getItemcode() + ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getQuantity()="
				+ getQuantity() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

	
	
	
	

}
