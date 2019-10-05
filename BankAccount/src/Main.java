
public class Main {

	public static void main(String[] args) {
		

		BankAccount account = new BankAccount();
				
		System.out.println(account.getAccountNumber());
		System.out.println(account.getBalance());
		System.out.println(account.getCustomerName());
		System.out.println(account.getEmail());
		System.out.println(account.getPhoneNumber());
		
		account.makeDeposit(50.00);
		System.out.println(account.getBalance());
		account.makeWithdrawal(922.35);
		System.out.println(account.getBalance());
		account.makeWithdrawal(750.00);
		System.out.print(account.getBalance());
		

	}

}
