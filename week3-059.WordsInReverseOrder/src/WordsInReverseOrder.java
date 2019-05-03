import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String text = "test";
        while(text.length()!=0) {
            System.out.print("Type a word: ");
            text = reader.nextLine();
            words.add(text);
        }

        int place = words.size()-1;
        System.out.println("You typed in the following words: ");
        while (place > -1) { // remember why place <= teachers.size() doesn't work?
            System.out.println(words.get(place));
            place--;
        }
        // create here an ArrayList
    }
}
