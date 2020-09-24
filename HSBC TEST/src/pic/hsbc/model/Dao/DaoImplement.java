package pic.hsbc.model.Dao;

import java.util.ArrayList;
import java.util.List;

import pic.hsbc.exceptions.UserNotFoundException;
import pic.hsbc.model.Beans;

public class DaoImplement implements DaoInterface{
	List<Beans> li=new ArrayList<Beans>();
	@Override
	public Beans adduser(Beans b) {
		// TODO Auto-generated method stub
		
		li.add(b);
		return b;
	}

	@Override
	public Beans[] giveusers() {
		// TODO Auto-generated method stub
		Beans[] data=li.toArray(new Beans[li.size()]);
		return data;
	}

	@Override
	public Beans fetchuser(int accno) {
		for(int i=0;i<li.size();i++)
     {
	         if(li.get(i).getAccountno()==accno)
	         {
	        	 return li.get(i);
	         }
     }
	 return null;
		
	}

	@Override
	public Beans updateuser(int accno, Beans b) {
		for(int i=0;i<li.size();i++)
	     {
		         if(li.get(i).getAccountno()==accno)
		         {
		        	 li.set(i,b);
		         }
	     }
		return null;
		
	}
	
	

}
