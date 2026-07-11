package autoboxing;
public class AutoBoxing {
    public static void main(String[] args) {
        /* Autoboxing: converting primitive types to their 
        corresponding wrapper classes */
        Integer int1 = 165; // Autoboxing int to Integer
        Double double2 = 3.14; // Autoboxing double to Double
        Character char3 = 'A'; // Autoboxing char to Character

        System.out.println("Autoboxing Example:");
        System.out.println("Integer value: " + int1);
        System.out.println("Double value: " + double2);
        System.out.println("Character value: " + char3);

        // Using intern() method of String class
        // intern() method returns the canonical representation of the string
        String str1 = "Hello";
        String str2 = new String("Hello");

        String str3 = str2.intern();

        // Comparing strings
        System.out.println("\nString Comparison:");
        System.out.println("str1 == str2: " + (str1 == str2)); 
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1 == str3: " + (str1 == str3)); 
    }
}
