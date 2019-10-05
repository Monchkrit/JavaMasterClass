
public class BankAccount {
	
	private long accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public BankAccount() {
		this(425234, 995.72, "Donny Buckman", "dbuckman@aol.com", "831-229-8474");
		System.out.println("Empty constructor called");
	}
		
	public BankAccount(long accountNumber, double balance, String customerName, String email, String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void makeDeposit(double deposit) {
		if (deposit > 0)
			this.balance += deposit;
	}
	public void makeWithdrawal(double withdraw) {
		if (withdraw > this.balance) {
			System.out.println("Only "+this.balance+", transaction not processed.");
		}	else
			this.balance -= withdraw;
		
	}
}
