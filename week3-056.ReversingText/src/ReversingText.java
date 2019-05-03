
import java.util.Scanner;

public class ReversingText {

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
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
