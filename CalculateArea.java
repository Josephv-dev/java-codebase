import java.util.Scanner;

public class CalculateArea{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.Calculate the area of Circle");
		System.out.println("2.Calculate the area of Rectangle");
		System.out.println("3.Exit");
		
		System.out.print("Pick an Option");
		int option = input.nextInt();
		
		switch(option){
			case 1:
			{
				System.out.println("Area of a Circle");
				System.out.println("Area = pi*r^2");
				
				System.out.print("Enter a Radius: ");
				double radius = input.nextDouble();
				double circleArea = Math.PI * radius * radius;
				System.out.printf("The area of the circle is: %f%n",circleArea);
			}
			break;
			
			case 2:
			{
				System.out.println("Area of a Rectangle");
				System.out.println("Area = l*b");
				
				System.out.print("Enter a length: ");
				double legnth = input.nextDouble();
				
				System.out.print("Enter a breadth: ");
				double breadth = input.nextDouble();
				
				double rectangleArea = legnth * breadth;
				
				System.out.printf("The area of the circle is: %f%n",rectangleArea);
			}
			break;
			
			case 3:
			{
				if (option == 3){
					break;
					System.out.println("Exiting program.")
				}
			}
			break;
			
			default:
			System.out.println("Invalid choice. Please try again");
			break;
		}
	}
}