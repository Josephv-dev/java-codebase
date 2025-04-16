import java.util.Scanner;

// A while loop
public class MultiplicationOfNumber{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		System.out.print("Enter a StopValue: ");
		int stopValue = input.nextInt();
		
		int i = 1;
		
		while( i <= stopValue){
			int result = num * i;
			System.out.printf("%d x %d = %d%n",num ,i, result);
			
			i ++;
		}
		
	}
}

/* A for loop
public class MultiplicationOfNumber{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		for(int i = 1; i <= 12; i ++){
			int result = num * i;
			
			System.out.println(num + " "+"x"+ " " + i + "=" + result); 
		}
	}
}
*/