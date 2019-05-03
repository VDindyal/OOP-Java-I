
public class Accounts {

    public static void main(String[] args) {
        Account a = new Account("a", 100.0);
        Account b = new Account("b", 0.0);
        Account c = new Account("C", 0.0);
        transfer(a,b,50);
        transfer(b,c,25);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
