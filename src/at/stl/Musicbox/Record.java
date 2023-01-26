package at.stl.Musicbox;
import at.stl.phone.PhoneFile;

import java.util.ArrayList;
import java.util.List;


public class Record {
    private int ID;
    private String recordTitle;
    private List<Title> titles;
    private double SumMusic;


    public Record(int ID,String recordTitle){
        this.ID = ID;
        this.recordTitle = recordTitle;
        this.titles = new ArrayList<>();
        this.SumMusic = SumMusic;
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
        for(int i = 0; i<titles.size();i++){
            this.SumMusic += titles.get(i).getLength();
        }
        return SumMusic;
    }

    public void searchRecord(){
        for (Title title : this.titles){
            if(title.getTitle().equals(title)){
                System.out.println("Found");;
            }
        }
    }
}
