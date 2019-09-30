
public class Main {

	public static void main(String[] args) {
		
		for(var i = 8; i > 1; i--) {
			System.out.println("10,000 at "+i+"% interest = "+calculateInterest(10000.0, i));
			
		System.out.println("Is the number 23 prime? "+ isPrime(23));
		}
		var primeCount = 0;
		for (var i = 1; i < 100 ; i++) {
			if (isPrime(i) == true) {
			primeCount = primeCount + 1;
			System.out.println(i+" is a prime number.");
			}
			//if (primeCount == 10) {
			//	break;
			//}
		}

		System.out.println("There are "+primeCount+" prime numbers");
		
	}
	
	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate/100));
	}
	
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	

}
