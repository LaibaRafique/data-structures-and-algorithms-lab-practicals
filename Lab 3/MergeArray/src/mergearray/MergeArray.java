// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package mergearray;
import java.util.Arrays;
public class MergeArray {
        
    private int[] array;

    public MergeArray(int[] initialArray) {
        this.array = initialArray;
    }

    public void mergeArrays(int[] newArray) {
        //Creating a new array with combined length
        int[] mergedArray = new int[array.length + newArray.length];

        //Copying elements from the existing array
        System.arraycopy(array, 0, mergedArray, 0, array.length);

        //Copying elements from the new array
        System.arraycopy(newArray, 0, mergedArray, 
                array.length, newArray.length);

        //Updating the existing array with the merged array
        array = mergedArray;
    }

    public void displayArray() {
        System.out.println("Merged Array: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] initialArray = {11, 22, 33, 44};
        int[] newArray = {55, 66, 77, 88};

        MergeArray arrayMerger = new MergeArray(initialArray);

        System.out.println("Before merging:");
        arrayMerger.displayArray();

        // Merging arrays
        arrayMerger.mergeArrays(newArray);

        System.out.println("\nAfter merging:");
        arrayMerger.displayArray();
    }
}

