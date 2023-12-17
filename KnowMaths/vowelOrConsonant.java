// Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
import java.util.Scanner;
class vowelOrConsonant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet: ");
        String input = sc.next().toLowerCase();

        boolean lowercase = input.charAt(0)>=97 && input.charAt(0)<=122;
        boolean uppercase = input.charAt(0)>=65 && input.charAt(0)<=90;
        boolean vowel = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") ||input.equals("u");

        if(input.length()>1){
            System.out.println("Please Enter a alphabet not a string.");
        }
        else if(!(lowercase || uppercase)){
            System.out.println("It is not a letter . please enter a alphabetic letter.");
        }
        else if(vowel){
            System.out.println("Vowel!");
        }
        else{
            System.out.println("Consonant!");
        }
    }
}