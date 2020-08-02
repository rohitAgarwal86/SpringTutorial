package example1;

public class Users {
	
	private int Id;
	private String userName, userEmail;
	
	public Users()
	{
		
	}

	public Users(int Id, String name, String email)
	{
		this.Id=Id;
		this.userName=name;
		this.userEmail=email;
	}
	
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString()
	{
		return ("Id :" + this.Id + "Name :" + this.userName + "Email :" +this.userEmail);
	}
}
