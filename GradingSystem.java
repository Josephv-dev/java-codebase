import java.util.Scanner;

public class GradingSystem{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.Check your grade");
		System.out.println("2.Exit");
		System.out.print("Select an option: ");
		
		int choice = input.nextInt();
		input.nextLine();
		
		switch(choice){
			case 1:
			{
				System.out.println("Select a grade");
				System.out.println("-----------------");
				System.out.println("A");
				System.out.println("B");
				System.out.println("C");
				System.out.println("D");
				System.out.println("F");
				
				System.out.print("Enter a grade: ");
				String option = input.nextLine();
				
				switch(option){
					case "A":
					{
						System.out.println("'A': Excellent!");
					}
					break;
				
					case "B":
					{
						System.out.println("'B': Good Job!");
					}
					break;
				
					case "C":
					{
						System.out.println("'C': Satisfactory!");
					}
					break;
				
					case "D":
					{
						System.out.println("'D': Needs improvement!");
					}
					break;
				
					case "F":
					{
						System.out.println("'F': Failed!");
					}
					break;
				
					default:
					System.out.println("Invalid option");
					
				}	
			}
			break;
			
			case 2:
			{
				System.out.println("Exiting from program");
			}
			break;
			
			default:
			System.out.println("Invalid choice in the main"); 
			
		}
		
	}
	
	
}