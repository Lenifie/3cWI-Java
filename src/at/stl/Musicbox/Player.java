package at.stl.Musicbox;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Record> records;
    private List<Title> titles;
    int numTitle;
    int numRecord;


    public Player(){
        this.numRecord = numRecord;
        this.numTitle = numTitle;
        this.records = new ArrayList<>();
        this.titles = new ArrayList<>();
    }

    //Methods
    public void loadRecord(Record record){
        Record currentRecord;
        currentRecord = record;
        System.out.println(currentRecord.getRecordTitle());
    }


    public void play(){
        System.out.println("No Record");
    }
}
