package at.stl.account;

public class creditAccount extends account{

    public creditAccount(double amount) {
        super(amount);
    }

    @Override
    public double withdraw(double amount){
         System.out.println("Fehler nicht möglich");
        return amount;
    }
}
