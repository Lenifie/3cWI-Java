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
}
