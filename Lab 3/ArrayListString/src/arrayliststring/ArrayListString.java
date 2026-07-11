// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package arrayliststring;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListString {
    public static void main(String[] args) {
        
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add String");
            System.out.println("2. Display all elements");
            System.out.println("3. Display the largest String");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter a String: ");
                    String inputString = scanner.nextLine();
                    stringList.add(inputString);
                    break;

                case 2:
                    // Display all elements
                    System.out.println("All elements in the ArrayList: " 
                            + stringList);
                    break;

                case 3:
                    // Display the largest String
                    if (!stringList.isEmpty()) {
                        String largestString = findLargestString(stringList);
                        System.out.println("The largest String is: " 
                                + largestString);
                    } else {
                        System.out.println("ArrayList is empty. "
                                + "Add some Strings first.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. "
                            + "Please enter a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static String findLargestString(ArrayList<String> list) {
        String largestString = list.get(0);

        for (String str : list) {
            if (str.length() > largestString.length()) {
                largestString = str;
            }
        }
        return largestString;
    }
}
