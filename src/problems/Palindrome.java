package problems;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner newscanner = new Scanner(System.in);
        System.out.print("Check to see if a word is palindrome or not: ");
        String word = newscanner.nextLine();
        checkPalindrome(word);
    }
    public static void checkPalindrome(String word){
        String toLowerCase = word.toLowerCase();
        String str = "";

        for(int i = toLowerCase.length()-1; i >= 0; i--){
            str += toLowerCase.charAt(i);
        }
        if(toLowerCase.equals(str)){
            System.out.println("'" + word + "'" + " is a palindrome");
        }else{
            System.out.println("'" + word + "'" + " is not a palindrome");
        }
    }
}