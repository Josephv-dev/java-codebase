/*Write a Java program that takes an integer input from the user and then determines 
if the entered number is a prime number or not. 
You can use the Scanner class to get input from the user.*/


import java.util.Scanner;

public class PrimeNumberInput{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		if(isPrime(number)){
			System.out.println(number+" " + "is a prime number");
		}
		else{
			System.out.println(number+" " + "is not a prime number");
		}
		input.close();
	}
	
	public static boolean isPrime(int n){
		if(n <= 1){
			return false;
		}
			
		for(int i = 2;i <= Math.sqrt(n); i++){
			if(n % i == 0){
				return false;
			}
		} 
		return true;
	}
}