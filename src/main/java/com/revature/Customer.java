package com.revature;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
	
	Customer(String userName, String password, long ssn){
		this.userName=userName;
		this.password=password;
		this.ssn=ssn;
	}
	
	String userName;
	String password;
	long ssn;
	
	List<Account> accounts = new ArrayList<Account>();

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

	public long getSsn() {
		return ssn;
	}

	public void setSsn(long ssn) {
		this.ssn = ssn;
	}

	public String getAccounts() {
		String output = this.userName+" owns the following accounts: \n";
		for(Account a: accounts) {
			output = output+a.getAccName()+": SSN-"+a.getSsn()+". Balance: "+a.getBalance()+"\n";
			if(!a.isApplied()) {
				output = output+"Needs Approval. \n";
			}
		}
		return output;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	

}
