import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int num: list) {
            sum = sum + num;
        }
        return sum;
    }


    public static double average(ArrayList<Integer> list) {
        int total = sum(list);
        double average = (double) total / list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        ArrayList<Double> list2 = new ArrayList<Double>();
        double avg = average(list);
        double element;
        for(int num: list) {
            element = (double) num - avg;
            element = element * element;
            list2.add(element);
        }
        double total = 0;
        for(double number: list2) {
            total = total+number;
        }
        double variance = (double) total/(list2.size()-1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
