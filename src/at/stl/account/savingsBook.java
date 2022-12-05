package at.stl.account;

public class savingsBook extends account {
    double max = 1000;

    public savingsBook(double amount) {
        super(amount);
    }

    @Override
    public double withdraw(double amount) {
        if ((getBalance() - amount) > 0) {
            return super.withdraw(amount);
        } else if (getBalance() < max) {
            System.out.println("Einzahlung nicht mehr möglich");

        } else {
            System.out.println("Keine Deckung");
            return 0;

        }
        return amount;
    }
}
