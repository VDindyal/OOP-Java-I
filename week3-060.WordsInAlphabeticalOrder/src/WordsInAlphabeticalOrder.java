
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String text = "test";
        while(text.length()!=0) {
            System.out.print("Type a word: ");
            text = reader.nextLine();
            words.add(text);
        }
        Collections.sort(words);
        System.out.println("You typed in the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
