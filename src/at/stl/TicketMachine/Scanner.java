package at.stl.TicketMachine;
import java.util.ArrayList;
import java.util.List;

public class Scanner {
    private Controller controller;
    private Tickets ticket;

    public Scanner(){
        this.ticket = ticket;
    }

    //Methods
    public void insertTicket(Tickets ticket){
        if(ticket == null){
            System.out.println("Error! Ticket eingabe!");
        }
        else{
            controller.getPrice();
        }

    }
}
