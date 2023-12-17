import java.util.Scanner;
// Write a Java recursive method to check if a given string is a palindrome.
public class palindromDetection {
    public static boolean isPalindrome(String str) {
        // Base case: an empty string or a string with one character is a palindrome
        str = str.toLowerCase();
        if (str.length() <= 1) {
          return true;
        }
    
        // Recursive case: check if the first and last characters are equal,
        // and recursively check if the substring between them is a palindrome
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
    
        if (firstChar != lastChar) {
          return false;
        }
    
        String remainingSubstring = str.substring(1, str.length() - 1);
        return isPalindrome(remainingSubstring);
      }
    
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        boolean isPalindrome1 = isPalindrome(str);
        System.out.println(str + " is a palindrome: " + isPalindrome1);
    
        
      }
}
