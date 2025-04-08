import java.util.Scanner;

public class CurrencyConverter{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Wlcome TO Currency Converter what do U Wish to do");
		System.out.println("1. Currency Converter");
		System.out.println("2. Exit");
		
		System.out.println("--------------------------------------------");
		System.out.print("Pick an option: ");
		int option = input.nextInt();
		System.out.println("--------------------------------------------");
		
		switch(option){
			case 1:
			{
				System.out.println("1. USD to EUR");
				System.out.println("2. USD to GBP");
				System.out.println("3. EUR to USD");
				System.out.println("4. EUR to GBP");
				
				System.out.println("--------------------------------------------");
				System.out.print("Enter your choice of conversion: ");
				int choiceOfConversion = input.nextInt();
				System.out.println("--------------------------------------------");

				
				switch(choiceOfConversion){
					case 1:
					{
						System.out.print("Enter amount You want to convert from (USD to EUR): ");
						double amount = input.nextDouble();
						if (amount >= 0){
							double result = amount * 0.85;
							System.out.printf("%f to EUR is %f%n", amount, result);
						}
						else{
							System.out.println("Invalid amount");
						}

					}
					break;
					
					case 2:
					{
						System.out.print("Enter amount You want to convert from (USD to GBP): ");
						double amount = input.nextDouble();
						if (amount >= 0){
							double result = amount * 0.75;
							System.out.printf("%f to GBP is %f%n", amount, result);
						}
						else{
							System.out.println("Invalid amount");
						}
					}
					break;
					
					case 3:
					{
						System.out.print("Enter amount You want to convert from (EUR to USD): ");
						double amount = input.nextDouble();
						if (amount >= 0){
							double result = amount * 1.18;
							System.out.printf("%f to USD is %f%n", amount, result);
						}
						else{
							System.out.println("Invalid amount");
						}
					}
					break;
					
					case 4:
					{
						System.out.print("Enter amount You want to convert from (EUR to GBP): ");
						double amount = input.nextDouble();
						if (amount >= 0){
							double result = amount * 0.88;
							System.out.printf("%f to GBP is %f%n", amount, result);
						}
						else{
							System.out.println("Invalid amount");
						}
					}
					break;
					
					default:
					System.out.println("Invalid Choice of Conversion");
				}
				
				
				
			}
			break;
			
			case 2:
			{
				System.out.println("Exiting the Conersion Program");
				System.out.println("Thanks!!");
			}
			break;
			
			default:
			System.out.println("Invalid choice of option");
			
			
			
			
			
		}
		
	}
}