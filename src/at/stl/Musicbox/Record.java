package at.stl.Musicbox;
import at.stl.phone.PhoneFile;

import java.util.ArrayList;
import java.util.List;


public class Record {
    private int ID;
    private String recordTitle;
    private List<Title> titles;



    public Record(int ID,String recordTitle){
        this.ID = ID;
        this.recordTitle = recordTitle;
        this.titles = new ArrayList<>();
    }

    //Methods
    public void setRecordTitle(String recordTitle) {this.recordTitle = recordTitle;}
    public String getRecordTitle() {return recordTitle;}

    public void setID(int ID) {this.ID = ID;}
    public int getID() {return ID;}

    public void addTitle(Title title){
        this.titles.add(title);
    }

    public double getSumOfMusic(){
        double sumOfMusic = 0;
        for(int i = 0; i < this.titles.size();i++){
            sumOfMusic += this.titles.get(i).getLength();
        }
        System.out.println("Sum of Records: " + sumOfMusic);
        return sumOfMusic;
    }

    public void searchRecord(Title title){
        for (Title title2 : this.titles){
            if(title2 == title) {
                System.out.println("Found");
            }
        }
    }
}
