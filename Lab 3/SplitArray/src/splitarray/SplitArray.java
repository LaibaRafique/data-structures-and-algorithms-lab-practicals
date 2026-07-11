// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package splitarray;
import java.util.Arrays;
public class SplitArray {
    public static void main(String[] args) {
        
        int[] originalArray = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int key = 16;

        System.out.println("Original Array: " + Arrays.toString(originalArray));

        //Split the array at the index where the key is found
        int[] resultArray = splitArray(originalArray, key);

        if (resultArray != null) {
            System.out.println("Array after splitting at key " + key + ": "
                    + Arrays.toString(resultArray));
        } else {
            System.out.println("Key not found in the array.");
        }
    }
    //Method to split the array at the index where the key is found
    private static int[] splitArray(int[] array, int key) {
        int index = indexOf(array, key);

        if (index != -1) {
            return Arrays.copyOfRange(array, index, array.length);
        } else {
            return null; // Key not found
        }
    }

    //Method to find the index of a key in the array
    private static int indexOf(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1; //Key not found
    }
}
