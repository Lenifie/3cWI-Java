package at.stl.account;

public class giroAccount extends account{
    private int limit;

    public giroAccount(double amount, int limit) {
        super(amount);
        this.limit = limit;
    }


    @Override
    public double withdraw(double amount) {
        if ((getBalance() - amount)>(limit * -1)){
            System.out.println("Widthdrawn " + amount + " Euros");
            return super.withdraw(amount);
        }else {
            System.out.println("Leider keine Deckung");
            return 0;
        }


    }
}
