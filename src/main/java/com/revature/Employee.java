package com.revature;
import java.util.Scanner;

public class Employee extends User{
	
	String userName = "Revature";
	String password = "R3V4L4T1ON";
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isValidEmployee(String u, String p) {
		if(u.contentEquals(userName)&&p.contentEquals(password)) {
			return true;
		}else return false;
	}
	
	public void EmpAccess() {
		System.out.println("_______________________________________________________\n"
				+ "Show Users      Review Applications       Log Out\n"
				+ "     (1)                (2)                  (3)");
	}
	
	
	

}
