import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.random = new Random();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int num = 0;
        int count = 0;
        // Write the number drawing here using the method containsNumber()
        while (count < 7) {
            num = (this.random.nextInt(39))+1;
            if(!this.containsNumber(num)) {
                this.numbers.add(num);
                count++;
            }
        }
    }

    public boolean containsNumber(int number) {
        if (!this.numbers.contains(number)) {
            return false;
        } else  {
            return true;
        }
    }
}
