/*Write a Java program that uses a for loop to check if a given number is a prime number. 
Let's start by checking if the number 17 is prime*/

public class PrimeNumber{
	public static void main(String[] rgs){
		
		int num = 17;
		if(num <= 1){
			System.out.println("This is not a prime number");
			return; //he return statement is important here to stop further execution for non-prime cases.
		}
		boolean isPrime = true;
		
		for(int i = 2; i <= Math.sqrt(num); i++){
			if(num % i == 0){
				isPrime = false;
				break;
			}
		} 
		if(isPrime){
			System.out.printf("%d is a prime number",num);
		}
		else{
			System.out.printf("%d is not a prime number",num);
		}
		
		
	}
}