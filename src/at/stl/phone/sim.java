package at.stl.phone;

public class sim {
    private int id;
    private String number;

    public sim(int id, String number){
        this.id = id;
        this.number = number;
    }

    //Methods

    public void setId(int id) {this.id = id;}
    public int getId() {return id;}

    public void setNumber(String number) {this.number = number;}
    public String getNumber() {return number;}

    public void sim(){
        System.out.println(id + " " + number);
    }

    public void doCall(){

    }
}
