// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package bubblesort;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        // Taking 10 numbers as input
        int[] array = new int[10];
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("\nOriginal Array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // Print the current state of the array after each iteration
            System.out.println("Iteration " + (i + 1) + ":");
            printArray(arr);
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
