/* Write a Java program that uses nested for loops to print the following pattern:

*****
****
***
**
*
*/

public class ReversePrintPattern{
	public static void main(String[] args){
		for(int i = 1; i <= 5; i ++){
			for(int j = 5; j >= i; j --){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}