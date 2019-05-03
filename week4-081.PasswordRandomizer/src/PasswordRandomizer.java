import java.util.Random;

public class PasswordRandomizer {
    private int passlength;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.passlength = length;
    }

    public String createPassword() {
        int num = 0;
        char symbol;
        String password = "";
        for (int i = 0; i < this.passlength; i++) {
            num = this.random.nextInt(25);
            symbol = "abcdefghijklmnopqrstuvwxyz".charAt(num);
            password += symbol;
        }
        return password;
    }
}
