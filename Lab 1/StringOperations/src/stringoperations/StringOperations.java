package stringoperations;
public class StringOperations {
    public static void main(String[] args) {
        String s1,s2,s3,s4,s5,str;
        s1="C++ ";
        s2="Object Oriented ";
        s3="Python ";
        s4="Programming is fun ";
        s5="Java ";
        str=s1.concat(s2).concat(s3).concat(s4).concat(s5);
        System.out.println(str);
        System.out.println(s4.toUpperCase());
        System.out.println(str.substring(8));
    }
}
