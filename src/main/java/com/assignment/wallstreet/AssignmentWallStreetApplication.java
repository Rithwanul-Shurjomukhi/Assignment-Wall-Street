package com.assignment.wallstreet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AssignmentWallStreetApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssignmentWallStreetApplication.class, args);
    }

}
