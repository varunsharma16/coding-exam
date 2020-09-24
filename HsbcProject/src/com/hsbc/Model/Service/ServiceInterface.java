package com.hsbc.Model.Service;

import com.hsbc.Exceptions.ItemNotFoundException;

public interface ServiceInterface {
	public  Object store (Object b);
	public Object[] getItems() throws ItemNotFoundException;

}
