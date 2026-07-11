// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package selectionsort;
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {33, 6, 11, 45, 3};

        System.out.println("Original Array:");
        printArray(array);

        selectionSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

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
