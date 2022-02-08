package kz.iitu.itse1902.muhamedi.database.computerCaseParts;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Data
public class Processor {

    private int id;
    private String manufacturer;
    private String model;
    private int coreNum;

    public Processor(int id, String manufacturer, String model, int coreNum) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.coreNum = coreNum;
    }

    public Processor(int id) {
        this.id = id;
    }

    public void init(){
        System.out.println("Processor Bean doing initialize...");

        String DEFAULT_MANUFACTURER = "Intel";
        String DEFAULT_MODEL = "Core i7";

        if (manufacturer == null){
            System.out.println("Using default manufacturer");
            manufacturer = DEFAULT_MANUFACTURER;
        }

        if (model == null){
            System.out.println("Using default model");
            model = DEFAULT_MODEL;
        }
    }

    public void destroy(){
        System.out.println("Computer case doing destroying...");
    }

//    public static List<Processor> getCases(){
//        List<Processor> computerCases = new ArrayList<>();
//
//        computerCases.add(new Processor(1,"intel i5","8gb","Nvidia Geforce GTX","512gb SSD","225WT"));
//        computerCases.add(new Processor(2,"intel i7","16gb","Nvidia Geforce GTX 1650","1Tb SSD","300WT"));
//        computerCases.add(new Processor(3,"intel i9","32gb","Nvidia Geforce GTX TFI","2Tb SSD","225WT"));
//
//
//        return computerCases;
//    }
}
