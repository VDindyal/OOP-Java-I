
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int len = name.length();
        int count = 0;
        int num = 1;
        while (count<len) {
            System.out.println(num+". character: " + name.charAt(count));
            count++;
            num++;
        }
    }
}
