
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name1 = reader.nextLine();

        System.out.println("Type your age: ");
        Integer age1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type your name: ");
        String name2 = reader.nextLine();

        System.out.println("Type your age: ");
        Integer age2 = Integer.parseInt(reader.nextLine());

        int result = age1+age2;

        System.out.println(name1+" and "+name2+" are "+result+ " years old in total.");
    }
}
