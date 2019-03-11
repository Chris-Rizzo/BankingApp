package com.revature;

public class Admin extends User{
	
	String userName = "ILikeMoney69";
	String password = "123456789";
	// If you're ever mindbogglingly bored to the point where you can't think of anything,
	// just imagine what kind of man this administrator is
	
	
	public boolean isValidAdmin(String u, String p) {
		if(u.contentEquals(userName)&&p.contentEquals(password)) {
			return true;
		}else return false;
	}

}
