package at.stl.Musicbox;
import at.stl.phone.PhoneFile;

import java.util.ArrayList;
import java.util.List;


public class Record {
    private int ID;
    private String recordTitle;
    private List<Title> titles;
    private float SumMusic;


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

    public void getSumOfMusic(Title title){
        this.SumMusic += title.getLength();
    }

    public Title searchRecord(List<Title>titles){
        for (Title title : this.titles){
            if(title.getTitle().equals(title)){
                return title;
            }
        }
        return null;
    }
}
