package com.example.sonardemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarDemoApplication {
    private Integer x;

    public static void main(String[] args) {
        SpringApplication.run(SonarDemoApplication.class, args);
    }

    public boolean sum() {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sum2() {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

}
