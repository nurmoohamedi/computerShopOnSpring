package kz.iitu.itse1902.muhamedi;

import org.springframework.stereotype.Component;

@Component
public class ChillPopMusic implements Music{
    @Override
    public String getSong() {
        return "All the time";
    }
}
