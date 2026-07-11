// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package mergesort;
import java.util.Arrays;
import java.util.Random;
public class MergeSort {
    public static void main(String[] args) {
        //Generate 10 random numbers
        int[] array = generateRandomArray(10);
        System.out.println("Original Array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted Array:");
        printArray(array);
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            //Find the middle point
            int middle = left + (right - left) / 2;
            //Recursively sort the first and second halves
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            //Merge the sorted halves
            merge(arr, left, middle, right);
            //Print the current state of the array after each iteration
            System.out.println("Sorting from index " + left + " to " 
                    + right + ":");
            printArray(arr);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        //Create temporary arrays
        int[] leftArray = Arrays.copyOfRange(arr, left, left + n1);
        int[] rightArray = Arrays.copyOfRange(arr, middle + 1, middle + 1 + n2);
        //Merge the temporary arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        //Copy remaining elements of leftArray[], if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        //Copy remaining elements of rightArray[], if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            //Generating random numbers between 0 and 99
            array[i] = random.nextInt(100); 
        }
        return array;
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
