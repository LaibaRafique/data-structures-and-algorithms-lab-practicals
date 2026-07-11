
package numberssum;
import java.util.Scanner;
public class NumbersSum {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = inp.nextInt();
        int sum=calculateSum(n);
        System.out.println("The sum of numbers from 1 to "+n+" is "+sum);
    }
    private static int calculateSum(int n){
        if(n==1){
            return n;
        }
        else {
            return n+calculateSum(n-1);
        }
    }
}
