/*Write a Java program that uses a for loop to print the even numbers from 2 to 20 (inclusive), 
with each number separated by a space on a single line.*/
//using printf 
public class PrintEvenNumbers{
	public static void main(String[] args){
		for(int i = 1; i <= 20; i ++){
			if(i % 2 == 0){
				System.out.printf("%d ",i);
			}
		}
	}
}


/* using print()
public class PrintEvenNumbers{
	public static void main(String[] args){
		for(int i = 1; i <= 20; i ++){
			if(i % 2 == 0){
				System.out.print(i+ " ");
			}
		}
	}
}*/