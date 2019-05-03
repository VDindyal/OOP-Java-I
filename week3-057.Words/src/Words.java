import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String text = "test";
        while(text.length()!=0) {
            System.out.print("Type a word: ");
            text = reader.nextLine();
            words.add(text);
        }

        int place = 0;
        System.out.println("You typed the following words: ");
        while (place < words.size()) { // remember why place <= teachers.size() doesn't work?
            System.out.println(words.get(place));
            place++;
        }
    }
}
