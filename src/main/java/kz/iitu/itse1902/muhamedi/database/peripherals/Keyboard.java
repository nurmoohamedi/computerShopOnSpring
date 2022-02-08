package kz.iitu.itse1902.muhamedi.database.peripherals;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Keyboard {

    private int id;
    private String model;

    public Keyboard(int id, String model) {
        this.id = id;
        this.model = model;
    }
}
