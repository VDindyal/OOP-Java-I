import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        char charac = lastCharacter(name);
        System.out.println("Last character: "+charac);
    }

    public static char lastCharacter(String text) {
        int len = text.length();
        return text.charAt(len-1);
    }
}
