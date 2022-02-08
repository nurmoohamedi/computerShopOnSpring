package kz.iitu.itse1902.muhamedi.database.computerCaseParts;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Data
public class RAM {

    private int id;
    private String storage;

    public RAM(int id, String storage) {
        this.id = id;
        this.storage = storage;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying RAM Bean");
    }

}
