// Name: Muhammad Ahmer, Roll No:2022F-BSE-165
package binarysearch;
public class BinarySearch {
    public static void main(String[] args) {
        int[] array=new int[20];
        for (int i = 0;i < array.length;i++) {
            array[i]=(int)(Math.random()*10);
        }
        int key=4; 
        int index=binarySearch(array,key);
        if (index != -1) {
            System.out.println("Element "+key+" found at index "+index);
        } else {
            System.out.println("Element "+key+" not found in the array");
        }
    }
    static int binarySearch(int[] array,int key) {
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
