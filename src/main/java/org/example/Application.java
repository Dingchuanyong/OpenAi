package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("hahahh ");

        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();
        String property = environment.getProperty("server.port");
        System.out.println("端口为：{}"+property);
    }
}