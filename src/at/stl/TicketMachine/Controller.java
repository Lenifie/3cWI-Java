package at.stl.TicketMachine;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private double price;

    private Tickets ticket;

    public Controller(){
        this.ticket = ticket;
    }

    //Methods
    public void setPrice(double price) {this.price = price;}

    public double getPrice(){
        double time = ticket.getEditingDate() - ticket.getPaidDate();
        price = time/60 * 1;
        System.out.println(price);
        return price;
    }
}
