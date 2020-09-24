package com.hsbc.Controller;

import java.util.Iterator;
import java.util.Scanner;

import com.hsbc.Exceptions.ItemNotFoundException;
import com.hsbc.Model.Beans.Apparel;
import com.hsbc.Model.Beans.Electronics;
import com.hsbc.Model.Beans.FoodItems;
import com.hsbc.Model.Service.ServiceImplementation;
import com.hsbc.Model.Utility.Factory;
import com.hsbc.Model.Utility.Type;

public class MainController {

	public static void main(String[] args) {
		ServiceImplementation service=(ServiceImplementation)Factory.getinstance(Type.SERVICE);
		Scanner sc=new Scanner(System.in);
		int input=0;
		do {
			System.out.println("welcome");
			System.out.println("select category");
			System.out.println("/1.Electronics  2.FoodItems 3.Apparel  4. Electronics Retrival 5.Fooditems Retrival  6.Apparel Retrival");
			input=sc.nextInt();
			switch(input)
			{
			case 1:
				Electronics el=new Electronics();
				System.out.println("itemcode");
				el.setItemcode(sc.nextInt());
				System.out.println("itemname");
				el.setName(sc.next());
				System.out.println("price");
				el.setPrice(sc.nextInt());
				System.out.println("enter waranty");
			    el.setWarranty(sc.nextInt());
			    Electronics elec=(Electronics) service.store(el);
			    break;
			case 2:
				FoodItems fi=new FoodItems();
				System.out.println("itemcode");
				fi.setItemcode(sc.nextInt());
				System.out.println("itemname");
				fi.setName(sc.next());
				System.out.println("price");
				fi.setPrice(sc.nextInt());
				System.out.println("quantity");
				fi.setQuantity(sc.nextInt());
				System.out.println("true for vegetarian false for non veg");
				fi.setVegetarian(sc.nextBoolean());
				FoodItems food=(FoodItems) service.store(fi);
			case 3:
				Apparel sp=new Apparel();
				System.out.println("itemcode");
				sp.setItemcode(sc.nextInt());
				System.out.println("itemname");
				sp.setName(sc.next());
				System.out.println("quantity");
				sp.setQuantity(sc.nextInt());
				System.out.println("size");
				sp.setSize(sc.next());
				System.out.println("material");
				sp.setMaterial(sc.next());
				Apparel app=(Apparel) service.store(sp);
				
				
			case 4	:
				try {
				Electronics[] arrayelec=(Electronics[]) service.getItems();
				for(Electronics k:arrayelec)
				{
					System.out.println(k);
				}
				}
				catch(ItemNotFoundException e)
				{
					e.getMessage();
				}
			case 5:
				try {
					FoodItems[] arrayfood=(FoodItems[]) service.getItems();
					for(FoodItems m:arrayfood)
					{
						System.out.println(m);
					}
					}
					catch(ItemNotFoundException e)
					{
						e.getMessage();
					}
			case 6:
			{
				try {
					Apparel[] appra=(Apparel[]) service.getItems();
					for(	Apparel u:appra)
					{
						System.out.println(u);
					}
					}
					catch(ItemNotFoundException e)
					{
						e.getMessage();
					}
			}
   
			    
				
			
			}
		
		}while(input !=6);

	}

}
