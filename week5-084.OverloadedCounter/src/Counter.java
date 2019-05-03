public class Counter {
    private int count;
    private boolean check;

    public Counter() {
        this(0, false);
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter(int startingValue, boolean check) {
        this.count = startingValue;
        this.check = check;
    }

    public int value() {
        return this.count;
    }

    public void increase() {
        this.count++;
    }
    public void decrease() {
        this.count--;
        if(this.check && this.count < 0) {
            this.count = 0;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.count += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            this.count -= decreaseAmount;
            if(this.check && this.count < 0) {
                this.count = 0;
            }
        }
    }

}