package com.revature;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.logging.Logger;

public class Driver {

	private static final Logger LOGGER = Logger.getLogger(Driver.class.getName());
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		List<Customer> customers = new ArrayList<Customer>();
		
		while(true) {
		
		System.out.println("	     Welcome to RevaBank.\n"
		+ "________________________________________________\n"
		+ "New User?    Registered?     Employee?        Administrator\n"
		+ "   (1)           (2)            (3)                 (4)\n"
		+ "Enter a number.");
		

		int loginType = sc.nextInt();
		
				if(loginType==1) { 
					AccountRegistration(sc, (ArrayList) customers); // Passing the scanner through methods is wonderful
					continue;
				
				
				}else if (loginType==2) {
					System.out.println("This is where you'd log into a registered user account,\n"
							+ "If that functionality was there.\n"
							+ "Coming soon.");
				
					
					
					
				// ################ Employee Block ################
				}else if(loginType==3){  
					
					System.out.println("Provide valid employee login information to access the employee console.\n"
							+ "Username: ");
					String userName = sc.next();
					System.out.println("Password:");
					String pass = sc.next();
					if(EmployeeValidation(userName,pass)==true) {
						System.out.println("Welcome, employee.");
						Employee emp = new Employee();
						boolean empLogin=true;
							while(empLogin) {
							emp.EmpAccess();
							int empFunc = sc.nextInt();
							if(empFunc==1) {
								int i = 1;
								for (Customer a: customers) {
									System.out.println(i+". "+a.userName+": "+a.getSsn());
									i++;
								}
								System.out.println("Enter the number of the user you wish to see the accounts for:");
								
								int empInput = sc.nextInt()-1;
								Customer chosenCustom = customers.get(empInput);
								System.out.println(chosenCustom.getAccounts());
								
								
								
								
							}else if(empFunc==2) {
								
							}else {
								System.out.println("Logging out.");
								empLogin=false;
								continue;
							}
							
						}
						// View Accounts
						
						
						// View Pending Accounts
						
						
						
						
						
						
						
					}else{System.out.println("Invalid login information.");continue;}
					
					
					
		// $$$$$$$$$$$$$$$$ Administrator Block $$$$$$$$$$$$$$$$
				}else if(loginType==4){	
					
					System.out.println("Provide valid administrator login information to access the administration console.\n"
							+ "Username: ");
					String userName = sc.next();
					System.out.println("Password:");
					String pass = sc.next();
					if(AdministratorValidation(userName,pass)==true) {
						System.out.println("Welcome, Administrator.");
					} else {System.out.println("Invalid login information.");continue;}
					
					
					
				}
				
				else {
					System.out.println("Closing.");
					break;
				}
			
		
		}
		sc.close();
	}
	
	// ============= Customer Block =============

	
	public static void AccountRegistration(Scanner sc, ArrayList customers) {
		System.out.println("Welcome to RevaBank! We will begin the registration process.\n"
				+ "Username: ");
		String userName = sc.next();
		System.out.println("Password: ");
		String pass = sc.next();
		System.out.println("Social Security Number: ");
		long ssn = 0;
		try{ssn = Long.parseLong(sc.next());}catch(NumberFormatException ex) {LOGGER.log(Level.SEVERE, "Not a number.");		}
		Customer currCustomer = new Customer(userName,pass,ssn);
		customers.add(currCustomer);
		System.out.println("Your account credentials are: \n"
				+ "Username: "+ currCustomer.getUserName()+"\n"
				+ "Password: "+ currCustomer.getPassword()+"\n"
				+ "Social Security Number: "+ currCustomer.getSsn());
		System.out.println("To use our bank, you must first apply for an account. \n"
				+ "This account has its own name and balance and will be tied to your login.\n"
				+ "A RevaBank employee will then review your application and approve it. \n"
				+ "RevaBank Account Name: ");
		Account newAcc = new Account(userName, sc.next(), ssn);
		currCustomer.accounts.add(newAcc);
		System.out.println("Thank you. Please wait for your account to be approved.\n");
		
		System.out.println("A user may make multiple accounts. Would you like to do so?\n"
				+ "Yes             No\n"
				+ "(1)            (2)");
		int cont=0;
		try{cont = Integer.parseInt(sc.next());}catch(NumberFormatException ex) {LOGGER.log(Level.SEVERE, "Not a number.");}
		boolean multiAccReq=true;
		while(multiAccReq) {
			if(cont==1){System.out.println("Creating another account.\n");
			Account consAcc = new Account(userName, sc.next(), ssn);
			currCustomer.accounts.add(consAcc);
			System.out.println("Good.\n"
					+ "____________________________\n"
					+ "Create Another        Return\n"
					+ "     (1)                (2)");
			cont = Integer.parseInt(sc.next());
			} else multiAccReq=false;
		}
		
	}
	
	// Employee and Administration Validation methods. 
	// These take things out of the main method. Keep it clean.
	
	public static boolean EmployeeValidation(String userName, String pass) {
		Employee e = new Employee();
		boolean isValid = e.isValidEmployee(userName, pass);
		System.out.println(isValid);
		return isValid;
	}
	
	public static boolean AdministratorValidation(String userName, String pass) {
		Admin ad = new Admin();
		boolean isValid = ad.isValidAdmin(userName, pass);
		System.out.println(isValid);
		return isValid;
	}
	
	
	// Main Employee Method(s).
	
	public static void EmployeeAccounts() {
		
	}
	
	
	

}
