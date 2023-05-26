package test_objects;

public class users_test_object {
	public String username(String username)
	{
		String message = null;
		if(username.equals("admin"))
		{
			message="valid_user";
		}
		else
		{
			message ="invalid user";
		}
		return message;
	}
	

}
