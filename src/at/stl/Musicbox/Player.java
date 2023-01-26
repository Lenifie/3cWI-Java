package at.stl.Musicbox;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Record> records;
    private List<Title> titles;
    int num;

    public Player(){
        this.num = num;
        this.records = new ArrayList<>();
        this.titles = new ArrayList<>();
    }

    //Methods
    public void loadRecord(Record record){

    }

    public void play(Record record){
        Title element = titles.get(num);
        record.getRecordTitle();
    }
}
