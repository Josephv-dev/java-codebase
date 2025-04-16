/*Write a Java program that uses a for loop to print all the
prime numbers between 1 and 50 (inclusive).*/

public class PrimeNumberBetween1and50 {
    public static void main(String[] args) {

        for (int num = 1; num <= 50; num++) {
            if (isPrime(num)) { // Call a helper function to check if num is prime
                System.out.println(num);
            }
        }
    }

    // Helper function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}