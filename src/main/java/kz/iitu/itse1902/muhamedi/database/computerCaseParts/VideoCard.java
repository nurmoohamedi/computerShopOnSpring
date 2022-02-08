package kz.iitu.itse1902.muhamedi.database.computerCaseParts;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Data
public class VideoCard {

    String DEFAULT_STORAGE = "16 GB";
    String DEFAULT_MODEL = "NVIDIA-GeForce";

    private int id;
    private String model;
    private String storage;

    public VideoCard(int id, String model, String storage) {
        this.id = id;
        this.model = model;
        this.storage = storage;
    }

    @PostConstruct
    public void init(){
        System.out.println("VideoCard Bean doing initialize...");

        if (model == null){
            System.out.println("Using default model");
            model = DEFAULT_MODEL;
        }

        if (storage == null){
            System.out.println("Using default storage");
            storage = DEFAULT_STORAGE;
        }
    }

}
