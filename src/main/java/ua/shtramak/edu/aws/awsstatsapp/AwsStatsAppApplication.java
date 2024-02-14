package ua.shtramak.edu.aws.awsstatsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class AwsStatsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsStatsAppApplication.class, args);
    }

}
