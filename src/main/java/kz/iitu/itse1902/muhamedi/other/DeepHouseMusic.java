package kz.iitu.itse1902.muhamedi.other;

import org.springframework.stereotype.Component;

@Component
public class DeepHouseMusic implements Music{
    @Override
    public String getSong() {
        return "A Million of My Soul";
    }
}
