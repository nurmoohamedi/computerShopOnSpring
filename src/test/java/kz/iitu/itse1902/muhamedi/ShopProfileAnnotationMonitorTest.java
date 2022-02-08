package kz.iitu.itse1902.muhamedi;


import kz.iitu.itse1902.muhamedi.config.ServiceConfig;
import kz.iitu.itse1902.muhamedi.service.ComputerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles(value = "monitor")
@ContextConfiguration(classes = {ServiceConfig.class}, loader = AnnotationConfigContextLoader.class)
public class ShopProfileAnnotationMonitorTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testMonitorProfile(){

        ComputerService service = (ComputerService) context.getBean("monitorBean");
        assertNotNull(service);

        service.getAllMonitors().forEach(m-> System.out.println(m));

    }



}
