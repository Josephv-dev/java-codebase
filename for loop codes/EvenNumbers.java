// A Java program that print all even numbersfrom 1 to 20
public class EvenNumbers{
	public static void main(String[] args){
		
		for(int num = 1; num <= 20; num ++){
			if(num % 2 == 0){
				System.out.printf("%d%n",num);
			}
		}
		
	}
}