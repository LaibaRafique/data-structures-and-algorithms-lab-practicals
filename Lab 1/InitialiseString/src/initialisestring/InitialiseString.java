package initialisestring;
public class InitialiseString {
    public static void main(String[] args) {
       String s1,s2,s3,s4,s5;
       // String Literal
       s1="Python";
       s2="Java";
       // New Keyword
       s3=new String("Hello World");
       s4=new String("Hello World");
       // intern() Method
       s5=new String("Python").intern();
       // String immutability 
       System.out.println((s1==s2)+", Strings are not equal");
       System.out.println((s3==s4)+", Strings are not equal");
       System.out.println((s1==s5)+", Strings are equal");
    }
}
