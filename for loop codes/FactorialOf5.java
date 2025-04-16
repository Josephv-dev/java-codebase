/*Write a Java program that uses a for loop to calculate the factorial of a given number. 
Let's start with calculating the factorial of 5*/

public class FactorialOf5{
	public static void main(String[] args){
		
		int num = 5;
		long factorial = 1;
		
		for(int i = 1; i<= num; i++){
			
			factorial = factorial * i;
		}
		System.out.printf("The factorial of %d is %d%n", num, factorial);
	}
}