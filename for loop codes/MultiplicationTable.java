/* Write a Java program that uses a for loop to print a simple multiplication table for a given number. 
Let's start with the multiplication table of 7, from 1 to 10.*/

public class MultiplicationTable{
	public static void main(String[] args){
		
		int num = 7;
		
		int stopValue = 10;
		
		for(int i = 1; i <= stopValue; i ++){
			
			int result = num * i;
			
			System.out.printf("%d x %d = %d%n", num, i, result);
		}
	} 
}