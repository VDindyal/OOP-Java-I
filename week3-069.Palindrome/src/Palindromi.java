import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String rev = reverse(text);
        if(text.equals(rev)) {
            return true;
        }
        return false;
    }

    public static String reverse(String text) {
        int len = text.length() - 1;
        String reverse = "";
        while (len>-1) {
            reverse = reverse + text.charAt(len);
            len--;
        }
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
