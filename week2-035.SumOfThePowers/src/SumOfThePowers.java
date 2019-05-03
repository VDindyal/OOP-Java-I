
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        int num=1;
        int sum = 1;
        while (num<limit+1) {
            sum = sum+(int)Math.pow(2, num);
            num = num+1;
        }
        System.out.println("The result is "+sum);
    }
}
