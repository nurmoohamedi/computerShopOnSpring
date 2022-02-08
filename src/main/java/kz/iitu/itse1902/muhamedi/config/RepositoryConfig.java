package kz.iitu.itse1902.muhamedi.config;

import kz.iitu.itse1902.muhamedi.repository.KeyboardRepositoryImpl;
import kz.iitu.itse1902.muhamedi.repository.MonitorRepositoryImpl;
import kz.iitu.itse1902.muhamedi.repository.MouseRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class RepositoryConfig {

    @Bean @Lazy
    MouseRepositoryImpl mouseRepository() {
        return new MouseRepositoryImpl();
    }

    @Bean @Lazy
    MonitorRepositoryImpl monitorRepository() {
        return new MonitorRepositoryImpl();
    }

    @Bean @Lazy
    KeyboardRepositoryImpl keyboardRepository(){
        return new KeyboardRepositoryImpl();
    }

}
