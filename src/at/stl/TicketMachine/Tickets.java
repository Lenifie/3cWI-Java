package at.stl.TicketMachine;
import java.util.Date;

public class Tickets {
    private int ID;
    private  Date editingDate;
    private  Date paidDate;


    public Tickets(){
        this.ID = ID;
        this.editingDate = editingDate;
        this.paidDate = paidDate;
    }

    //Methods
    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}

    public Date getEditingDate() {return editingDate;}
    public void setEditingDate(Date editingDate) {this.editingDate = editingDate;}

    public Date getPaidDate() {return paidDate;}
    public void setPaidDate(Date paidDate) {this.paidDate = paidDate;}



}
