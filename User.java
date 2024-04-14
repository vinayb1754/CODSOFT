package task3;

public class User {

	private static long id=187654321;
	private String name;
	private long mobileNumber;
	private String address;
	private int balance;
	private String gender;
	private String accountNumber;
	
	
	
	public User() {
		
	}



	public User(String name, long mobileNumber, String address, int balance, String gender) {
		
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.balance = balance;
		this.gender = gender;
		this.accountNumber=""+id++;
	}



	public static long getId() {
		return id;
	}



	public static void setId(long id) {
		User.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", mobileNumber=" + mobileNumber + ", address=" + address + ", balance=" + balance
				+ ", gender=" + gender + "]";
	}
	
	
	
	
}
