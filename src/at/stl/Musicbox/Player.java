package at.stl.Musicbox;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Record> records;
    private List<Title> titles;
    int numTitle;
    int numRecord;

    public Player(int numRecord,int numTitle){
        this.numRecord = numRecord;
        this.numTitle = numTitle;
        this.records = new ArrayList<>();
        this.titles = new ArrayList<>();
    }

    //Methods
    public void loadRecord(Record record){
        Title element = titles.get(numRecord);
        System.out.println(record.getRecordTitle());
    }

    public void play(Record record){
        Title element = titles.get(numTitle);
        System.out.println(record.getRecordTitle());
    }
}
