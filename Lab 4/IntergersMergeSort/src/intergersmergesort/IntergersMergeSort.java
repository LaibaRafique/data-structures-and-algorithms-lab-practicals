// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package intergersmergesort;
import java.util.Arrays;
public class IntergersMergeSort {
    public static void main(String[] args) {      
        //Sample unordered list of integers
        Integer[] unsortedList = {50, 12, 40, 6, 10, 2, 33};
        //Print the unsorted list
        System.out.println("Unsorted List: " + Arrays.toString(unsortedList));
        //Perform Merge Sort
        mergeSort(unsortedList);
        //Print the sorted list
        System.out.println("Sorted List: " + Arrays.toString(unsortedList));
    }
    public static <T extends Comparable<T>> void mergeSort(T[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            //Split the array into two halves
            T[] leftArray = Arrays.copyOfRange(array, 0, mid);
            T[] rightArray = Arrays.copyOfRange(array, mid, array.length);
            //Recursive calls for the two halves
            mergeSort(leftArray);
            mergeSort(rightArray);
            //Merge the sorted halves
            merge(array, leftArray, rightArray);
        }
    }
    private static <T extends Comparable<T>> void merge(T[] array, 
            T[] leftArray, T[] rightArray) {
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i].compareTo(rightArray[j]) < 0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        //Copy remaining elements of leftArray, if any
        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        //Copy remaining elements of rightArray, if any
        while (j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
