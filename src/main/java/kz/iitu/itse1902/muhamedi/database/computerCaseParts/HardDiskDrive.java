package kz.iitu.itse1902.muhamedi.database.computerCaseParts;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Data
public class HardDiskDrive implements InitializingBean {

    private int id;
    private String type;
    private String volume;

    public HardDiskDrive(int id, String type, String volume) {
        this.id = id;
        this.type = type;
        this.volume = volume;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("HardDiskDrive Bean doing initialize...");

        if (type == null){
            System.out.println("Using default type");
            type = "SSD";
        }

        if (volume == null){
            System.out.println("Using default volume");
            volume = "1 TB";
        }
    }
}
