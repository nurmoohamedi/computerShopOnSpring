package kz.iitu.itse1902.muhamedi.database.computerCaseParts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class Motherboard {

    private int id;
    private String processor;
    private String ram;
    private String video_card;
    private String hard_drive;
    private String power_supply;

    public Motherboard(int id, String processor, String ram, String video_card, String hard_drive, String power_supply) {
        this.id = id;
        this.processor = processor;
        this.ram = ram;
        this.video_card = video_card;
        this.hard_drive = hard_drive;
        this.power_supply = power_supply;
    }

    public Motherboard() {

    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Computer case doing initialize...");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Computer case doing destroying...");
    }

    @Override
    public String toString() {
        return "ComputerCase{" +
                "id=" + id +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", video_card='" + video_card + '\'' +
                ", hard_drive='" + hard_drive + '\'' +
                ", power_supply='" + power_supply + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getVideo_card() {
        return video_card;
    }
    public void setVideo_card(String video_card) {
        this.video_card = video_card;
    }

    public String getHard_drive() {
        return hard_drive;
    }
    public void setHard_drive(String hard_drive) {
        this.hard_drive = hard_drive;
    }

    public String getPower_supply() {
        return power_supply;
    }
    public void setPower_supply(String power_supply) {
        this.power_supply = power_supply;
    }

    public static List<Motherboard> getCases(){
        List<Motherboard> computerCases = new ArrayList<>();

        computerCases.add(new Motherboard(1,"intel i5","8gb","Nvidia Geforce GTX","512gb SSD","225WT"));
        computerCases.add(new Motherboard(2,"intel i7","16gb","Nvidia Geforce GTX 1650","1Tb SSD","300WT"));
        computerCases.add(new Motherboard(3,"intel i9","32gb","Nvidia Geforce GTX TFI","2Tb SSD","225WT"));


        return computerCases;
    }
}
