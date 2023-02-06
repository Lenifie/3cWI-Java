package at.stl.TicketMachine;

public class Main {
    public static void main(String[] args) {
        Tickets t1 = new Tickets(1);
        Tickets t2 = new Tickets(2);

        Controller c1 = new Controller();
        CashDispenser cd1 = new CashDispenser(20);
        Scanner s1 = new Scanner();
        Printer p1 = new Printer();
        TicketMachine tm1 = new TicketMachine();



        tm1.insertTicket();



    }
}
