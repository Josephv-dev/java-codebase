import java.util.Scanner;

public class SimpleDrinkVendingMachine{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to The Vending machine");
		System.out.println("--------------------------------");
		System.out.println("1. To Navigate through the list of Drinks");
		System.out.println("2. Exit");

		System.out.print("Enter a option (e.g 1 or 2): ");
		int Option = input.nextInt();

		switch(Option){
			case 1:
			{
				System.out.println("Welcom to the list of drinks pick a choice");
				System.out.println("--------------------------------------------");
				System.out.println("1. Coke");
				System.out.println("2. Pespi");
				System.out.println("3. Sprite");
				System.out.println("4. Water");

				System.out.print("Enter your choice (1 to 4): ");
				int choice = input.nextInt();

				System.out.println("--------------------------------------------");
				switch(choice){
					case 1:
					{
						System.out.println("You have selected Coke");
					}
					break;

					case 2:
					{
						System.out.println("You have selected Pespi");
					}
					break;

					case 3:
					{
						System.out.println("You have selected Sprite");
					}
					break;

					case 4:
					{
						System.out.println("You have selected Water");
					}
					break;

					default:
					System.out.println("Invalid selection");

				}
			}
			break;

			case 2:
			{
				System.out.println("Exiting from the program");
			}
			break;

			default:
			System.out.println("Invalid option");
		}
	}
}