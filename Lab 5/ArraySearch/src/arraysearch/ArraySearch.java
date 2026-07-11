// Name: Muhammad Ahmer, Roll No:2022F-BSE-165
package arraysearch;
import java.util.Arrays;
public class ArraySearch {
    public static void main(String[] args) {
        int[] array={73, 12, 2, 4, 7, 22, 0, 54, 29, 1};
        int key = 2;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array,key);
        if (index >= 0) {
            System.out.println("Element found at index "+index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
