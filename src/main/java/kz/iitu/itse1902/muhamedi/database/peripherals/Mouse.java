package kz.iitu.itse1902.muhamedi.database.peripherals;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Mouse {

    private int id;
    private String model;


    public Mouse(int id, String model) {
        this.id = id;
        this.model = model;
    }


//    public static List<Mouse> getMouse(){
//
//        List<Mouse> mouseList = new ArrayList<>();
//
//        mouseList.add(new Mouse(1,"Samsung"));
//        mouseList.add(new Mouse(2,"LG"));
//        mouseList.add(new Mouse(3,"Sony"));
//
//        return mouseList;
//    }

}
