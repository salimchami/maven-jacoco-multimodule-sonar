package io.salimchami.jacoco.coverage.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.salimchami.jacoco.coverage")
public class MavenAggregateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenAggregateApplication.class, args);
    }
}
