// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package stringpalindrome;
public class StringPalindrome {
    public static void main(String[] args) {

        String[] strings = {"hello", "deed", "wow", "noon", "world"};

        for (String str : strings) {
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
    }
    private static boolean isPalindrome(String str) {
        /* Removing spaces and converting to lowercase 
        for a case-insensitive check */
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
