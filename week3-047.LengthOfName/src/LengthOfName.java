
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int len = calculateCharacters(name);
        System.out.println("Number of characters: "+len);
        // call your method from here
    }

    public static int calculateCharacters(String text) {
        return text.length();
    }
    // do here the method
    // public static int calculateCharacters(String text)
    
}
