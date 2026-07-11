
package descendingorder;
import java.util.Scanner;
public class DescendingOrder {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int k=inp.nextInt();
        for(int i=k;i>=0;i--)
        {
            System.out.print(i+" ");
        }
    }
}
