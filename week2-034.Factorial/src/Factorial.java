import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        int num=1;
        int sum = 1;
        while (num<limit+1) {
            sum = sum*num;
            num = num+1;
        }
        System.out.println("Factorial is: "+sum);
    }
}
