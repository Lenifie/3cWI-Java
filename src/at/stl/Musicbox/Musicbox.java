package at.stl.Musicbox;
import at.stl.phone.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class Musicbox {
    private List<Record> records;
    private List<Title> titles;
    private Record Record;

    public Musicbox(){
        this.records = new ArrayList<>();
        this.titles = new ArrayList<>();
        this.Record = Record;
    }

    //Methods
    public void addRecord(Record record){
        if(this.records.size() == 50){
            System.out.println("Musicbox ist voll! Bitte zuerst eine Platte entfernen");
        }
        else {
            this.records.add(record);
        }
    }

    public void removeRecord(Record record){
        this.records.remove(record);

    }

    public void getSumOfMusic(Title title){
        this.Record.getSumOfMusic(title);
    }

    public void searchRecord(List<Title>titles){
        this.Record.searchRecord(titles);
    }

}
