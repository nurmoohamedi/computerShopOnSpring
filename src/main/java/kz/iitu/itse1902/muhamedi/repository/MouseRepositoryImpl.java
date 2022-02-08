package kz.iitu.itse1902.muhamedi.repository;

import kz.iitu.itse1902.muhamedi.database.peripherals.Mouse;
import kz.iitu.itse1902.muhamedi.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class MouseRepositoryImpl implements Repository {

    @Override
    public List getAll() {

        List<Mouse> mouseList = new ArrayList<>();

        mouseList.add(new Mouse(1,"Samsung"));
        mouseList.add(new Mouse(2,"Logitech"));
        mouseList.add(new Mouse(3,"Apple"));

        return mouseList;
    }
}
