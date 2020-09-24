package com.hsbc.Model.Beans;

public class Apparel extends Items{
	private int size;
	private String material;
	
	public Apparel() {
		super();
	}
	public Apparel(int itemcode, String name, int price, int  quantity, int size, String material) {
		super(itemcode, name, price, quantity);
		this.size = size;
		this.material = material;
	}
	public int getSize() {
		return size;
	}
	public void setSize(String string) {
		this.size = string;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + ", getItemcode()=" + getItemcode() + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + ", getQuantity()=" + getQuantity() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
