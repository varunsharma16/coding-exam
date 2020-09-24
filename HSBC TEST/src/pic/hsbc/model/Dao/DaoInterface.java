package pic.hsbc.model.Dao;

import pic.hsbc.model.Beans;

public interface DaoInterface {
	public  Beans adduser(Beans b);
	public  Beans[] giveusers();
	public  Beans fetchuser(int accno);
	public Beans updateuser(int accno,Beans b);
	

}
