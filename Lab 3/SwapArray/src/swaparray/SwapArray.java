// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package swaparray;
import java.util.Arrays;
public class SwapArray {
    public static void main(String[] args) {
        int[] array1 = {10, 9, 8, 7};
        int[] array2 = {1, 2, 3, 4};

        System.out.println("Before swapping:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        //Swapping elements
        for (int i = 0; i < 4; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        System.out.println("\nAfter swapping:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
    }
}

