// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package arraysummean;
public class ArraySumMean {
    public static void main(String[] args) {
        
        double[] realNumbers = {3, 4, 5, 6, 7, 8, 9};

        double sum = 0;
        for (double num : realNumbers) {
            sum += num;
        }
        double mean = sum / realNumbers.length;

        System.out.println("Array Elements: " 
                + java.util.Arrays.toString(realNumbers));
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);

        //Depict memory management
        System.out.println("\nMemory Management:");
        System.out.println("1. The array 'realNumbers' is declared and "
                + "initialized with 7 real numbers.");
        System.out.println("2. The sum and mean are calculated using a loop.");
        System.out.println("3. Memory is managed automatically "
                + "by Java's garbage collector.");
        System.out.println("4. No explicit memory deallocation "
                + "is needed as Java handles it.");
    }
}
