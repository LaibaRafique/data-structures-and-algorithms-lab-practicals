// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package vectorsum;
import java.util.Vector;
public class VectorSum {
    public static void main(String[] args) {
       
        Vector<Integer> integerVector = new Vector<>();
        for (int i = 1; i <= 10; i++) {
            integerVector.add(i);
        }

        System.out.println("Integers in the Vector: " + integerVector);

        int sum = 0;
        for (int num : integerVector) {
            sum += num;
        }
        System.out.println("Sum of Integers: " + sum);
    }
}
