package com.hsbc.Model.Dao;


import java.util.ArrayList;

public class DaoImplementation implements DaoInterface{
   private static  ArrayList<Object> li=new ArrayList<Object>();
	@Override
	public Object storeitem(Object p) {
	
		li.add(p);
		return p;
	}

	@Override
	public Object[] retrivalitem() {
		Object[] obj=li.toArray(new Object[li.size()]);
		return obj;
		
	}

}
