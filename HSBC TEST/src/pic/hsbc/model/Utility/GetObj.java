package pic.hsbc.model.Utility;

import pic.hsbc.model.Dao.DaoImplement;
import pic.hsbc.model.Service.ServiceImplement;

public class GetObj {

	public static Object getInstance(Type type)
	{
		Object obj=null;
		switch(type)
		{
		case SERVICE:
			obj=new ServiceImplement();
			break;
		case DAO:
			obj=new DaoImplement();
			break;
		}
		return obj;
		
		
	}
		

}
