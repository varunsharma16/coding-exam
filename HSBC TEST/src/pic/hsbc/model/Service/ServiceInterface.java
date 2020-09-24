package pic.hsbc.model.Service;

import pic.hsbc.exceptions.UserNotFoundException;
import pic.hsbc.model.Beans;

public interface ServiceInterface {
	public Beans store(Beans b);
	public Beans[]  getUsers();
	public Beans getuserbyaccountno(int accountno);
	public void transfer(int ac1,int ac2,int amount) throws UserNotFoundException;
	

}
