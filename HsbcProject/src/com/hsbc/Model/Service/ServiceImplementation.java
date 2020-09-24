package com.hsbc.Model.Service;

import com.hsbc.Exceptions.ItemNotFoundException;
import com.hsbc.Model.Dao.DaoImplementation;
import com.hsbc.Model.Utility.Factory;
import com.hsbc.Model.Utility.Type;

public class  ServiceImplementation implements ServiceInterface{
    private DaoImplementation dao;
    
	public ServiceImplementation() {
		dao=(DaoImplementation)Factory.getinstance(Type.DAO);
	}

	@Override
	public Object store(Object b) {
		return dao.storeitem(b);
		
	}

	@Override
	public Object[] getItems()  throws ItemNotFoundException{
		return dao.retrivalitem();
		
	}
	
	
}
