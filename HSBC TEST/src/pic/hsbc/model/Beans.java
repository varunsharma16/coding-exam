package pic.hsbc.model;

public class Beans {
	private String name;
	private static int id;
	private Double balance;
	private String City;
	private int accountno;
	public Beans() {
		this.accountno=id++;
		
	}
	public Beans(String name, Double balance, String city, int accountno) {
		super();
		this.name = name;
		this.balance = balance;
		City = city;
		this.accountno = id++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Beans.id = id;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	@Override
	public String toString() {
		return "Beans [name=" + name + ", balance=" + balance + ", City=" + City + ", accountno=" + accountno + "]";
	}
	
	
	

}
