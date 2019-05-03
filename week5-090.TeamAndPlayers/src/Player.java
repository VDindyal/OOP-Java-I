public class Player {

    private String playerName;
    private int goalsScored;

    public Player(String name, int goals) {
        this.playerName = name;
        this.goalsScored = goals;
    }

    public Player(String name) {
        this(name, 0);
    }

    public String getName() {
        return this.playerName;
    }

    public int goals() {
        return this.goalsScored;
    }

    public String toString() {
        return "Player: " + this.getName() + "," + " goals " + this.goals();
    }
}