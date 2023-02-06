package at.stl.TicketMachine;

public class TicketMachine {
    private Controller controller;
    private Tickets ticket;
    private Printer printer;
    private Scanner scanner;
    private CashDispenser cashDispenser;
    public TicketMachine(){
        this.ticket = ticket;
        this.controller = controller;
        this.printer = printer;
        this.scanner = scanner;
        this.cashDispenser = cashDispenser;

    }

    //Methods
    public void insertTicket(){
        scanner.insertTicket(ticket);
    }

    public void getTicket(){
        printer.getTicket();
    }
    public void getPrice(){
        controller.getPrice();
    }

    public double insertMoney(){
        cashDispenser.insertMoney();
    }


}
