// Name: Laiba Rafiq, Roll No:2022F-BSE-064
package binarysearch2;
public class BinarySearch2 {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 18, 22, 26, 30, 34, 38, 
            42, 46, 50, 54, 58, 62, 66, 70, 74};
        int key = 30;
        int result = binarySearch(array, key);
        if (result == -1) {
            System.out.println("Element "+key+" not found in the array.");
        } else {
            System.out.println("Element "+key+" found at index " +result);
        }
    }
    private static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return mid; 
            } else if (array[mid] < key) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return -1; 
    }
}
