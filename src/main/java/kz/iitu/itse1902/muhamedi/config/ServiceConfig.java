package kz.iitu.itse1902.muhamedi.config;

import kz.iitu.itse1902.muhamedi.service.ComputerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ServiceConfig {

    RepositoryConfig repositoryConfig = new RepositoryConfig();

    @Bean(name = "monitorBean")
    @Profile("monitor")
    public ComputerService computerMonitorService(){
        ComputerService service = new ComputerService(repositoryConfig.monitorRepository());
        service.setMouseRepository(repositoryConfig.mouseRepository());
        return service;
    }

    @Bean(name = "keyboardBean")
    @Profile("keyboard")
    public ComputerService computerKeyboardService(){
        ComputerService service = new ComputerService();
        service.setKeyboardRepository(repositoryConfig.keyboardRepository());
        return service;
    }

    @Bean(name = "mouseBean")
    @Profile("mouse")
    public ComputerService computerMouseService(){
        ComputerService service = new ComputerService();
        service.setMouseRepository(repositoryConfig.mouseRepository());
        return service;
    }


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);

        ComputerService service = context.getBean("computerService", ComputerService.class);

        service.getAllMonitors().forEach(m-> System.out.println(m.toString()));
        System.out.println("------------------------------------------");
        System.out.println(service.getMouseRepository().getAll());
    }

}
