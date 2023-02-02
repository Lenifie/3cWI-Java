package at.stl.Musicbox;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Record> records;
    private List<Title> titles;

    private Record currentRecord;



    public Player(){
        this.records = new ArrayList<>();
        this.titles = new ArrayList<>();
    }

    //Methods
    public void loadRecord(Record record){
        currentRecord = record;
        System.out.println(currentRecord.getRecordTitle());
    }


    public void play(int numTitle){
        if(this.currentRecord == null){
            System.out.println("No Record");
        }
        else{
            Title titles = this.currentRecord.getTitles().get(numTitle);
            System.out.println(currentRecord.getTitles().get(numTitle).getTitle());
        }

    }
}
