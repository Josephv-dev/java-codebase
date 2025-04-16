/*rite a Java program that uses a for loop to count the number of vowels (a, e, i, o, u) in a given string. 
For simplicity, let's use the string "Hello World". 
The count should be case-insensitive, meaning both 'a' and 'A' should be counted.*/

public class NumberOfVowel {
    public static void main(String[] args) {

        String word = "Hello World";
        int count = 0;

        for (int i = 0; i < word.length(); i++) { // Loop through each character of the word
            char currentChar = word.charAt(i); // Get the character at the current index

            // Check if the current character is a vowel (case-insensitive)
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' ||
                currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
                count++; // Increment the vowel count if it's a vowel
            }
        }

        System.out.printf("The number of vowels in \"%s\" is: %d%n", word, count);
    }
}

/* you convert everything to lower case
public class NumberOfVowelAlternative {
    public static void main(String[] args) {
        String word = "Hello World";
        int count = 0;
        String lowerCaseWord = word.toLowerCase(); // Convert the entire word to lowercase
        String vowels = "aeiou";

        for (int i = 0; i < lowerCaseWord.length(); i++) {
            char currentChar = lowerCaseWord.charAt(i);
            if (vowels.contains(String.valueOf(currentChar))) { // Check if the lowercase character is present in the "vowels" string
                count++;
            }
        }

        System.out.printf("The number of vowels in \"%s\" is: %d%n", word, count);
    }
}*/