package at.stl.Musicbox;
import at.stl.phone.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class Musicbox {
    private List<Record> records;

    public Musicbox(){
        this.records = new ArrayList<>();
    }

    //Methods
    public void addRecord(Record record){
        this.records.add(record);

    }
}
