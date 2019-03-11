package com.revature;

public class Account {
	
	Account(String owner, String accName, long ssn){
		this.owner = owner;
		this.accName = accName;
		this.ssn = ssn;
		this.applied=false;
	}
	
	
	public String owner;
	public String accName;
	long ssn;
	public int balance;
	public boolean applied;

	public long getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean isApplied() {
		return applied;
	}
	public void setApplied(boolean applied) {
		this.applied = true;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
}
