
public class HelloUser {
	
	private String userName;
	
	public HelloUser(String name)	{
		this.setUserName(name);
	}
	
	public void setUserName(String name) {
		this.userName = name;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void greetUser() {
		System.out.println("Hello " + this.getUserName() +"!");
		
	}
	
}
