package kz.iitu.itse1902.muhamedi;

import kz.iitu.itse1902.muhamedi.service.ComputerService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ComputerShopApplicationTests {

    @Autowired
    ApplicationContext context;

    @BeforeAll
    void before(){
        context = SpringApplication.run(TravelServiceApplication.class);
        System.out.println("\n------------------------------------------------------\n");
    }

    @Test
    @DisplayName("Monitors should displayed")
    void monitorLoads() {

        ComputerService service = context.getBean(ComputerService.class);
        service.getAllMonitors().forEach(s-> System.out.println(s.toString()));

    }

}
