package at.stl.account;

public class main {
    public static void main(String[] args) {
        account a1  = new account(25);
        a1.deposit(55);
        a1.withdraw(10);
        a1.getBalance();
        System.out.println("----------------");
        savingsBook s1 = new savingsBook(25);
        s1.withdraw(1000);
        s1.deposit(10);
        s1.getBalance();
        System.out.println("----------------");
        giroAccount g1 = new giroAccount(25, 500);
        g1.withdraw(45);
        g1.deposit(20);
        g1.getBalance();
        System.out.println("----------------");
        laendleGiroAccount lg1 = new laendleGiroAccount(25,300);
        lg1.deposit(300);
        lg1.withdraw(30);
        lg1.getBalance();
        System.out.println("----------------");
        creditAccount c1 = new creditAccount(25);
        c1.deposit(30);
        c1.withdraw(20);

    }

}
