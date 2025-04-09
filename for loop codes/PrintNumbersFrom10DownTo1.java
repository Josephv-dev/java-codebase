/* Write a Java program that uses a for loop to print the numbers from 10 down to 1 (inclusive), 
with each number on a separate line.*/

public class PrintNumbersFrom10DownTo1{
	public static void main(String[] args){
		for(int i = 10; i >= 1 ; i--){
			System.out.printf("%d%n",i);
		}
	}
}