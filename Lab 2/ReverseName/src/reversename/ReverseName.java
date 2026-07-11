
package reversename;
import java.util.Scanner;
public class ReverseName {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter your Full-Name: ");
        String fullName=inp.nextLine();
        String reverseName=reverseName(fullName);
        System.out.println("Reserve Name: "+reverseName);
    }
    private static String reverseName(String name){
        if (name.isEmpty()){
            return name;
        }
        else{
            char lastChar=name.charAt(name.length()-1);
            String remaining= name.substring(0, name.length()-1); 
            //will always go till end index -1
            return lastChar+reverseName(remaining);
        }    
    }
}
