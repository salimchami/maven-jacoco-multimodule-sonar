package io.salimchami.jacoco.coverage.web;

import io.salimchami.jacoco.coverage.domain.Domain;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Web {

    private final Domain domain;

    public Web(Domain domain) {
        this.domain = domain;
    }

    @GetMapping("/web")
    public ResponseEntity<String> ohYeah() {
        domain.coveredByIntegrationTest();
        return ResponseEntity.ok("oh yeah ! it works !");
    }

    public void coveredByUnitTest() {
        System.out.println("this method is covered by unit test");
    }

    public void notCoveredByTests() {
        System.out.println("this method is not covered");
    }
}
