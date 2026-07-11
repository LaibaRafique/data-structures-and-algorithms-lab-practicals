// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package hashcode;
import java.util.Scanner;
public class Hashcode {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to calculate its hash code:");
        String userInput = scanner.nextLine();

        // Calculate and display the hash code
        int hashCode = userInput.hashCode();
        System.out.println("Hash Code of \"" + userInput + "\": " + hashCode);

        // Close the scanner
        scanner.close();
    }
}
