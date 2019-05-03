public class Reformatory {
    private int timesWeight;

    public Reformatory() {
        this.timesWeight = 0;
    }

    public int totalWeightsMeasured() {
        return this.timesWeight;
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }

    public int weight(Person person) {   //85.1
        // returns the weight of the parameter
        this.timesWeight++;
        return person.getWeight();
    }

}
