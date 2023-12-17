import java.util.*;
// Write a Java recursive method to reverse a given string.


class stringReverser{
    public static String reverseString(String str){
          // Base case: if the string is empty or has only one character, it is already reversed
    if (str.isEmpty() || str.length() == 1) {
        return str;
      }
  
      // Recursive case: reverse the substring starting from the second character and concatenate the first character
      return reverseString(str.substring(1)) + str.charAt(0);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        String revString = reverseString(str);
        System.out.println("Original: "+str);
        System.out.println("Reversed: "+revString);
    }
}