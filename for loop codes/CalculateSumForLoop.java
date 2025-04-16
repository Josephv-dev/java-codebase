/*Write a Java program that uses a for loop to calculate the sum of the digits 
of a given integer. For example, if the input is 12345, the output 
should be 1 + 2 + 3 + 4 + 5 = 15.*/

public class CalculateSumForLoop {
    public static void main(String[] args) {

        int value = 12345;
        int sum = 0;

        // Initialize a temporary variable before the loop
        for (int tempValue = value; tempValue > 0; tempValue /= 10) {
            int digit = tempValue % 10; // Get the last digit
            sum += digit;              // Add the digit to the sum
        }

        System.out.printf("The sum of the digits of %d is: %d%n", value, sum);
    }
}
/* A while loop 
public class CalculateSum {
    public static void main(String[] args) {

        int value = 12345;
        int sum = 0;

        // We'll use a while loop here as it's more natural for processing digits
        // until the number becomes 0.

        int tempValue = value; // Create a temporary variable to modify

        while (tempValue > 0) {
            int digit = tempValue % 10; // Get the last digit (remainder when divided by 10)
            sum += digit;              // Add the digit to the sum
            tempValue /= 10;           // Remove the last digit (integer division by 10)
        }

        System.out.printf("The sum of the digits of %d is: %d%n", value, sum);
    }
}*/