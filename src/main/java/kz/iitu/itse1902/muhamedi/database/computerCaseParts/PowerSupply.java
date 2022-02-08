package kz.iitu.itse1902.muhamedi.database.computerCaseParts;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Data
public class PowerSupply {

    private int id;
    private String model;
    private String volume;

    public PowerSupply(int id, String model, String volume) {
        this.id = id;
        this.model = model;
        this.volume = volume;
    }

}
