import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

  @RequestMapping("/hello")
  String home() {
    return "Hello World!";
  }

  public static void main(String[] args) throws Exception {
    ApplicationContext ctx = SpringApplication.run(Application.class, args);
//    System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//    String[] beanNames = ctx.getBeanDefinitionNames();
//    Arrays.sort(beanNames);
//    for (String beanName : beanNames) {
//      System.out.println(beanName);
//    }
  }

}