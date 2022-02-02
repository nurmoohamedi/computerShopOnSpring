package kz.iitu.itse1902.muhamedi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TravelServiceApplication {

    static ApplicationContext context;

    public static void main(String[] args) {

        context = SpringApplication.run(TravelServiceApplication.class, args);

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "ApplicationContext.xml"
//        );

        MusicPlayer musicPlayer = context.getBean( MusicPlayer.class);

        musicPlayer.playMusic();

    }

}
