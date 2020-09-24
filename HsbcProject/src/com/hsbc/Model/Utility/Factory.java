package com.hsbc.Model.Utility;

import com.hsbc.Model.Dao.DaoImplementation;
import com.hsbc.Model.Service.ServiceImplementation;

public class Factory {
	
	public static Object getinstance(Type type)
	{
		Object obj=null;
		switch(type)
		{
		case SERVICE:
			obj=new ServiceImplementation();
			break;
			
		
		case DAO:
			obj=new DaoImplementation();
			break;
		}
		return obj;
	}

}
