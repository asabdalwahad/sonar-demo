package com.example.sonardemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class SonarDemoApplication {
    private static Integer x;

    public static void main(String[] args) {
        int z = Optional.of(x).get();
        System.out.println(z);
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
