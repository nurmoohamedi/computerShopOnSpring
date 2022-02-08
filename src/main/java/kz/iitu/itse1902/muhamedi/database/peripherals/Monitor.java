package kz.iitu.itse1902.muhamedi.database.peripherals;

import java.util.ArrayList;
import java.util.List;

public class Monitor {

    private int id;
    private String model;
    private String size;
    private String resolution;
    private String refreshRate;

    public Monitor(int id, String model, String size, String resolution, String refreshRate) {
        this.id = id;
        this.model = model;
        this.size = size;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
    }

    public Monitor() {

    }

    public static List<Monitor> getMonitors(){

        List<Monitor> monitors = new ArrayList<>();

        monitors.add(new Monitor(1,"Samsung","2.4 inch", "1920*1080","60Hz"));
        monitors.add(new Monitor(2,"LG","2.4 inch", "1366*900","30Hz"));
        monitors.add(new Monitor(3,"Sony","2.4 inch", "1920*1080","144Hz"));

        return monitors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(String refreshRate) {
        this.refreshRate = refreshRate;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", resolution='" + resolution + '\'' +
                ", refreshRate='" + refreshRate + '\'' +
                '}';
    }
}
