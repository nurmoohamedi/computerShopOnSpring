package kz.iitu.itse1902.muhamedi;
import kz.iitu.itse1902.muhamedi.config.RepositoryConfig;
import kz.iitu.itse1902.muhamedi.repository.Repository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication(scanBasePackages = "kz.iitu.itse1902.muhamedi.repository")
public class TravelServiceApplication {

//    public static void main(String[] args) {
////        GenericApplicationContext context = new AnnotationConfigApplicationContext(.class, RepositoryConfig.MouseConfig.class);
//
//        Repository repository = context.getBean("repository", Repository.class);
//
//        repository.getAll().forEach(m-> System.out.println(m.toString()));
//
//    }

}
