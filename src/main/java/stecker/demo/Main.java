package stecker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main class that Spring Boot uses to start application.
 */
@ComponentScan("stecker")
@SpringBootApplication
public class Main {

    /**
     * Start here.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

    }

}
