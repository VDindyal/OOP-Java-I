import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        int sum=0;
        int count=0;
        int even_count=0;
        int odd_count=0;
        System.out.println("Type numbers ");
        int num=0;
        while(true) {
            num = Integer.parseInt(reader.nextLine());
            if(num==-1) {
                break;
            }
            sum = sum+num;
            count++;
            if (num%2==0) {
                even_count++;
            } else {
                odd_count++;
            }
        }
        double average = (double) sum/count;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is: " + sum);
        System.out.println("How many numbers: "+count);
        System.out.println("Average: "+average);
        System.out.println("Even numbers: "+even_count);
        System.out.println("Odd numbers: "+odd_count);
    }
}
