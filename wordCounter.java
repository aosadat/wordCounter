import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Java program to count the number of occurrences of a word in a text file
 * based on user input.
 */
public class WordCounter {
    public static void main(String[] args) {
        // Prompt the user for the word to search for
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word to search for: ");
        String word = scanner.nextLine();

        // Prompt the user for the file path
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        // Open the file for reading
        File file = new File(filePath);
        Scanner fileScanner = null;

        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        // Count the number of occurrences of the word in the file
        int count = 0;
        while (fileScanner.hasNext()) {
            String nextWord = fileScanner.next();

            // Convert both words to lowercase to do case-insensitive comparison
            if (nextWord.toLowerCase().equals(word.toLowerCase())) {
                count++;
            }
        }

        // Print the total number of occurrences of the word in the file
        System.out.println("The word \"" + word + "\" appears " + count + " times in the file.");
    }
}