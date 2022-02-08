package kz.iitu.itse1902.muhamedi.config;

import kz.iitu.itse1902.muhamedi.database.ComputerCase;
import kz.iitu.itse1902.muhamedi.database.computerCaseParts.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:application.properties")
@Lazy(value = true)
public class ComputerCaseConfig {

    @Autowired
    Environment environment;

    // Implmented with Bean Annotations
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Processor processor(){
        return new Processor(1);
    }

    @Bean// implemented with @PostConstruct
    public VideoCard videoCard(){
        return new VideoCard(1,"NVIDIA-GeForce","4 GB");
    }

    @Bean// implemented with @PreDestroy
    public RAM ram(){
        return new RAM(1,environment.getProperty("ram.storage"));
    }

    @Bean// implemented with Interface InitializingBean
    public HardDiskDrive hardDiskDrive(){
        return new HardDiskDrive(1, environment.getProperty("hardDisk.type"), "256 GB");
    }

    @Bean// implemented with @PropertySource by external file
    public PowerSupply powerSupply(){
        return new PowerSupply(1, environment.getProperty("powerSupply.model"), environment.getProperty("powerSupply.volume"));
    }


    @Bean(initMethod = "doMyInit", destroyMethod = "doMyDestroy")
    @DependsOn(value = {
            "processor", "videoCard", "ram", "hardDiskDrive", "powerSupply"
    })
    @Scope("prototype")
    ComputerCase computerCase(){
        return new ComputerCase(processor(),ram(),videoCard(),hardDiskDrive(),powerSupply());
//        return new ComputerCase();
    }

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ComputerCaseConfig.class);

        ComputerCase computerCase = context.getBean("computerCase", ComputerCase.class);

        System.out.println(computerCase.getProcessor());
        System.out.println(computerCase.getHard_drive());
        System.out.println(computerCase.getRam());
        System.out.println(computerCase.getVideo_card());
        System.out.println(computerCase.getPower_supply());

        ComputerCase computerCase1 = context.getBean("computerCase", ComputerCase.class);
        System.out.println(computerCase.getProcessor()==computerCase1.getProcessor());

    }

}
