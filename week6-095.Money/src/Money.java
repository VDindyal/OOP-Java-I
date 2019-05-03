
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int newCents = this.cents + added.cents();
        int newEuros = this.euros + added.euros();
        return new Money(newEuros, newCents);
    }

    public boolean less(Money compared) {
        if (compared.euros == this.euros){
            if (this.cents < compared.cents) {
                return true;
            }
        }
        if (this.euros < compared.euros) return true;
        return false;
    }

    public int eurosToCents(int euros, int cents) {
        return euros * 100 + cents;
    }

    public Money minus(Money decremented) {
        int thisCents = eurosToCents(this.euros, this.cents);
        int thatCents = eurosToCents(decremented.euros, decremented.cents);
        int total = thisCents - thatCents;
        if(total < 0) {
            return new Money(0, 0);
        }
        return new Money(0, total);
    }

}
