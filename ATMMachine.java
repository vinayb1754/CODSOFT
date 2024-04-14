package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMMachine {
	static List<User> theUsers =new ArrayList<User>();
	static Scanner sc=new Scanner(System.in);
	User temp;
	public static void main(String[] args) {
		
		System.out.println("Welcome to ATM Machine..");
		
		
		int choice=0;
		
		do {
			System.out.println("1. Open Account");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposite");
			System.out.println("4. Check Bank Balance");
			System.out.println("5. Get All Users");
			System.out.println("6. Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			String acountNumber="";
			int amount=0;
			switch(choice) {
			case 1:
				System.out.println("From Account Opening");
				sc.nextLine();
				System.out.println("Enter user name:");
				String name=sc.nextLine();
			
				
				System.out.println(name+" Enter your mobile number:");
				long mobileNumber=sc.nextLong();
				sc.nextLine();
				System.out.println(name+" Enter your address:");
				String address=sc.nextLine();
				
				int balance=0;
				do {
					System.out.println("Enter minimum balance 1000");
					balance=sc.nextInt();
				}while(balance<1000);
				
				System.out.println(name+" Enter your gender:");
				sc.nextLine();
				String gender=sc.nextLine();
				
			//	System.out.println(name+" Enter your accountNumber");
				User user=new User(name,mobileNumber,address,balance,gender);
				
				accountOpening(user);
				
				break;
			case 2:
				
				System.out.println("From Withdraw");
				sc.nextLine();
				System.out.println("Enter account number:");
				acountNumber=sc.nextLine();
				System.out.println("Enter amount for withdrawl:");
				amount=sc.nextInt();
				withdrawAmount(acountNumber, amount);
				break;
			case 3:
				System.out.println("From deposite");
				sc.nextLine();
				System.out.println("Enter account number:");
				
				acountNumber=sc.nextLine();
				System.out.println("Enter amount for deposite:");
				amount=sc.nextInt();
				
				
				
				depositeAmount(acountNumber, amount);
				break;
			case 4: 
				System.out.println("From Check Bank Balance");
				sc.nextLine();
				System.out.println("Enter account number");
				acountNumber=sc.nextLine();
				checkBankBalance(acountNumber);
				break;
			case 5:
				getAllUsers();
				break;
			case 6: 
				System.out.println("Thank you visit Again ...!!!");
				break;
			}
			
		}while(choice!=6);

	}

	private static void checkBankBalance(String acountNumber) {
		boolean check=false;
		for(User user : theUsers) {
			if(user.getAccountNumber().equals(acountNumber)) {
				System.out.println("ypur Account balance = "+user.getBalance());
				check=true;
				break;
			}
		}
		if(!check) {
			System.out.println("Enter valid Account Number");
		}
	
	
	}

	private static void depositeAmount(String acountNumber, int amount) {
		boolean check=false;
		for(User user : theUsers) {
			if(user.getAccountNumber().equals(acountNumber)) {
				user.setBalance(user.getBalance()+amount);
				System.out.println("Transaction completed succefully.");
				check=true;
				break;
			}
		}
		if(!check) {
			System.out.println("Transaction unsucessfull enter valid account number");
		}
		
		
	}

	private static void withdrawAmount(String acountNumber, int amount) {
		System.out.println(acountNumber);
		boolean check=false;
		for(User user:theUsers) {
			if(user.getAccountNumber().equals(acountNumber))
			{
				if(user.getBalance()-amount>=1000) {
					user.setBalance(user.getBalance()-amount);
					System.out.println("Transaction completed succefully.");
					check=true;
					break;
				}else {
					System.out.println("Insufficient balance");
					check=true;
				}
			}
		}
		if(!check) {
			System.out.println("Transaction unsucessfull enter valid account number");
		}
		
	}
				
	
				
			

	private static void accountOpening(User user) {

		
		theUsers.add(user);
		System.out.println("Account opened successfully");
		System.out.println("Your account Number is : "+user.getAccountNumber());
		
		
		
		
	}
	public static void getAllUsers(){
		for(User user : theUsers) {
			System.out.println(user);
		}
	}

}
