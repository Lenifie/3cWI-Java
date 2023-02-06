package at.stl.TicketMachine;

public class CashDispenser {
    private double payIn;
    private Controller controller;
    public CashDispenser(double payIn){
        this.payIn = payIn;
    }

    //Methods
    public void insertMoney(){
       double remainingAmount = payIn - controller.getPrice();
        System.out.println(remainingAmount);
    }
}
