/*Write a Java program that uses a for loop to 
calculate the sum of all numbers from 1 to 100 (inclusive). 
After the loop finishes, print the calculated sum.*/
public class SumOf10Numbers{
	public static void main(String[] args){
		int sum = 0;
		
		for(int i = 1; i <= 100; i ++){
			sum += i;
			
		}
		System.out.printf("The sum is %d%n",sum);
	}
}