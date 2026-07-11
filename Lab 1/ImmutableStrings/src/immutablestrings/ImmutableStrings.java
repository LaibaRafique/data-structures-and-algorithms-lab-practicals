package immutablestrings;
import java.util.Scanner;
public class ImmutableStrings {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String s1,s2,s3;
        System.out.print("Enter 2 Strings:");
        s1=inp.next();
        s2=inp.next();
        s3 = s1 + " " + s2; // Concatenate strings
        
        // Display original strings
        System.out.println("Original Strings:");
        System.out.println("str1: " + s1);
        System.out.println("str2: " + s2);
        System.out.println("str3: " + s3);

        // Modify s1
        s1 = s1.toUpperCase();

        // Display modified strings
        // s3 remains unchanged even after modifying s1
        System.out.println("\nModified Strings:");
        System.out.println("str1: " + s1);
        System.out.println("str2: " + s2);
        System.out.println("str3: " + s3);
    }
}
