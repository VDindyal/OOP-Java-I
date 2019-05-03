
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String text = "test";
        while(text.length()!=0) {
            System.out.print("Type a word: ");
            text = reader.nextLine();
            if(words.contains(text)) {
                System.out.println("You gave the word " +text+ " twice");
                return;
            }
            words.add(text);
        }
        
    }
}
