package spring_angular_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringAngularDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAngularDemoApplication.class, args);
    }

}
