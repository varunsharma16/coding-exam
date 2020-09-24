package pic.hsbc.exceptions;

public class UserNotFoundException extends Exception {
	private String error;

	public UserNotFoundException(String error) {
		
		this.error = error;
	}
	public void getmessage()
	{
		System.out.println(error);
	}
	

}
