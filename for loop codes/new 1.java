/*Write a Java program that uses a for loop to calculate the factorial of a given number. 
Let's start with calculating the factorial of 5*/

public class FactorialOf5{
	public static void main(String[] args){
		
		int num = 5;
		int i = 1;
		
		for(num = 5; i >= 1; i++){
			System.out.printf("%d * %d", num, i);
		}
	}
}