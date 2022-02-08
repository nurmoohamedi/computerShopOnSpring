package kz.iitu.itse1902.muhamedi.repository;

import kz.iitu.itse1902.muhamedi.database.peripherals.Monitor;
import kz.iitu.itse1902.muhamedi.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class MonitorRepositoryImpl implements Repository {

    @Override
    public List getAll() {
        List<Monitor> monitors = new ArrayList<>();

        monitors.add(new Monitor(1,"Samsung","2.4 inch", "1920*1080","60Hz"));
        monitors.add(new Monitor(2,"LG","2.4 inch", "1366*900","30Hz"));
        monitors.add(new Monitor(3,"Sony","2.4 inch", "1920*1080","144Hz"));

        return monitors;
    }
}
