package at.stl.Musicbox;
import at.stl.phone.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class Musicbox {
    private List<Record> records;
    private List<Title> titles;
    private double SumMusic;

    public Musicbox(){
        this.records = new ArrayList<>();
        this.titles = new ArrayList<>();
        this.SumMusic = SumMusic;
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


    public double getSumOfMusic(){
        for(int i = 0; i<this.records.size();i++){
            this.SumMusic += this.records.get(i).getSumOfMusic();
        }
        return SumMusic;
    }

    public void searchRecord(){
        for (int i = 0; i<this.records.size();i++) {
            this.records.get(i).searchRecord();
        }

    }

}
