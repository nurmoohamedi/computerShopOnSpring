package kz.iitu.itse1902.muhamedi.repository;

import kz.iitu.itse1902.muhamedi.database.peripherals.Keyboard;
import kz.iitu.itse1902.muhamedi.database.peripherals.Monitor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRepositoryImpl implements kz.iitu.itse1902.muhamedi.repository.Repository {

    @Override
    public List getAll() {
        List<Keyboard> keyboards = new ArrayList<>();

        keyboards.add(new Keyboard(1,"HP"));
        keyboards.add(new Keyboard(2,"Logitech"));
        keyboards.add(new Keyboard(3,"Genius"));

        return keyboards;
    }
}
