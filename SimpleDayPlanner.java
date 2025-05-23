import java.util.Scanner;

public class SimpleDayPlanner{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Navigate to the days of the weeks");
		System.out.println("2.Exit");
		System.out.print("Choose an option: ");
		
		int option = input.nextInt();
		
		switch(option){
			case 1:
			{
				System.out.println("The Days of the week");
				System.out.println("----------------------");
				System.out.println("1.Monday");
				System.out.println("2.Tuesday");
				System.out.println("3.Wednesday");
				System.out.println("4.Thursday");
				System.out.println("5.Friday");
				System.out.println("6.Saturday");
				System.out.println("7.Sunday");
				
				System.out.print("Enter a choice: ");
				
				int choice = input.nextInt();
				
				System.out.println("----------------------");
				switch(choice){
					case 1:
					{
						System.out.println("Start the week strong");
					}
					break;
					
					case 2:
					{
						System.out.println("Time for focused work");
					}
					break;
					
					case 3:
					{
						System.out.println("Hump day - keep going");
					}
					break;
					
					case 4:
					{
						System.out.println("Almost there");
					}
					break;
					
					case 5:
					{
						System.out.println("TGIF!");
					}
					break;
					
					case 6:
					{
						System.out.println("Weekend relaxation time");
					}
					break;
					
					case 7:
					{
						System.out.println("Enjoy your sunday!");
					}
					break;
					
					default:
					System.out.println("Invalid choice");
				}
			}
			break;
			
			case 2:
			{
				System.out.println("Exiting program");
			}
			break;
			
			default:
			System.out.println("Invalid option");
		}
		
	}
}