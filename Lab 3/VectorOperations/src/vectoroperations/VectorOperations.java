// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package vectoroperations;
import java.util.Vector;
import java.util.Collections;
import java.util.Scanner;
public class VectorOperations {
    public static void main(String[] args) {
       
        //Create a Vector to store integer objects
        Vector<Integer> numberVector = new Vector<>();

        //Input numbers into the vector
        inputNumbers(numberVector);

        //Sort the vector
        Collections.sort(numberVector);

        //Display the sorted vector
        System.out.println("Sorted Vector: " + numberVector);

        //Display the largest number
        displayLargestNumber(numberVector);

        //Display the smallest number
        displaySmallestNumber(numberVector);
    }

    private static void inputNumbers(Vector<Integer> vector) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the vector: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int num = scanner.nextInt();
            vector.add(num);
        }
    }

    private static void displayLargestNumber(Vector<Integer> vector) {
        int largest = vector.lastElement();
        System.out.println("Largest Number: " + largest);
    }

    private static void displaySmallestNumber(Vector<Integer> vector) {
        int smallest = vector.firstElement();
        System.out.println("Smallest Number: " + smallest);
    }
}
