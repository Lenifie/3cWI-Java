package at.stl.account;

public class account {
    private double balance;
    private double amount;

    public account(double amount){
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    //einzahlen
    public void deposit(double amount){
        this.balance += amount;
    }

    public double getAmount() {
        return amount;
    }

    //abheben
    public double withdraw(double amount){
        this.balance -= amount;
        return amount;
    }


}
