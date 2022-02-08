package kz.iitu.itse1902.muhamedi.database;

import kz.iitu.itse1902.muhamedi.database.computerCaseParts.*;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Data
public class ComputerCase {

    private Processor processor;
    private RAM ram;
    private VideoCard video_card;
    private HardDiskDrive hard_drive;
    private PowerSupply power_supply;

    public ComputerCase(Processor processor, RAM ram, VideoCard video_card, HardDiskDrive hard_drive, PowerSupply power_supply) {
        this.processor = processor;
        this.ram = ram;
        this.video_card = video_card;
        this.hard_drive = hard_drive;
        this.power_supply = power_supply;
    }

    public ComputerCase() {

    }

    public void doMyInit(){
        System.out.println("Computer case doing initialize...");
    }

    public void doMyDestroy(){
        System.out.println("Computer case doing destroying...");
    }

    @Override
    public String toString() {
        return "ComputerCase{" +

                " processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", video_card='" + video_card + '\'' +
                ", hard_drive='" + hard_drive + '\'' +
                ", power_supply='" + power_supply + '\'' +
                '}';
    }

//    public static List<ComputerCase> getCases(){
//        List<ComputerCase> computerCases = new ArrayList<>();
//
//        computerCases.add(new ComputerCase(1,"intel i5","8gb","Nvidia Geforce GTX","512gb SSD","225WT"));
//        computerCases.add(new ComputerCase(2,"intel i7","16gb","Nvidia Geforce GTX 1650","1Tb SSD","300WT"));
//        computerCases.add(new ComputerCase(3,"intel i9","32gb","Nvidia Geforce GTX TFI","2Tb SSD","225WT"));
//
//
//        return computerCases;
//    }
}
