package pic.hsbc.model.Service;

import pic.hsbc.exceptions.UserNotFoundException;
import pic.hsbc.model.Beans;
import pic.hsbc.model.Dao.DaoImplement;
import pic.hsbc.model.Utility.GetObj;
import pic.hsbc.model.Utility.Type;

public class ServiceImplement implements ServiceInterface {

	private DaoImplement dao;
	
	public ServiceImplement() {
		DaoImplement dao= (DaoImplement) GetObj.getInstance(Type.DAO);
	}

	@Override
	public Beans store(Beans b) {
		
        return dao.adduser(b);
		
	}

	@Override
	public Beans[] getUsers() {
		return dao.giveusers();
	
	}

	@Override
	public Beans getuserbyaccountno(int accountno) {
		// TODO Auto-generated method stub
		return dao.fetchuser(accountno);
	}

	@Override
	public void transfer(int ac1, int ac2,int amount) throws UserNotFoundException {
		Beans obj1=dao.fetchuser(ac1);
		Beans obj2=dao.fetchuser(ac1);
		if(obj1 == null)
		{
			throw new UserNotFoundException("invalid accno");
		}
		else if (obj2 ==null)
		{
			throw new UserNotFoundException("invalid account number");
		}
		
		else
		{
			obj1.setBalance(obj1.getBalance()-amount);
			obj2.setBalance(obj1.getBalance()+amount);
			
		}
		
		
	}
	

}
