
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number? ");
        int limit = Integer.parseInt(reader.nextLine());
        int num=1;
        int sum = 0;
        while (num<limit+1) {
            sum = sum + num;
            num = num+1;
        }
        System.out.println("Sum is: "+sum);
    }
}
