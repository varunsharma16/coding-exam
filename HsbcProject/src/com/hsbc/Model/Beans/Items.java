package com.hsbc.Model.Beans;

public class Items {
	private int itemcode;
	private String name;
	private int price;
	private int quantity;
	
	public Items() {
		super();
	}
	public Items(int itemcode, String name, int price, int quantity) {
		super();
		this.itemcode = itemcode;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getItemcode() {
		return itemcode;
	}
	public void setItemcode(int itemcode) {
		this.itemcode = itemcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Items [itemcode=" + itemcode + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
    
}
