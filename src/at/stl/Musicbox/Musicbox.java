package at.stl.Musicbox;
import at.stl.phone.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class Musicbox {
    private List<Record> records;
    private List<Title> titles;

    public Musicbox(){
        this.records = new ArrayList<>();
        this.titles = new ArrayList<>();
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


    public void getSumOfMusic(){
        double SumMusic = 0;
        for(int i = 0; i<this.records.size();i++){
            SumMusic = this.records.get(i).getSumOfMusic();
        }
        System.out.println("Sum of all Records " + SumMusic);

    }

    public void searchRecord(Title titles){
        for (int i = 0; i<this.records.size();i++) {
            this.records.get(i).searchRecord(titles);
        }
    }

}
