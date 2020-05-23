package io.salimchami.jacoco.coverage.web;

import io.salimchami.jacoco.coverage.domain.Domain;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web {

    private final Domain domain;

    public Web(Domain domain) {
        this.domain = domain;
    }

    @GetMapping("/web")
    public ResponseEntity<String> ohYeah() {
        domain.coveredByIntegrationTest();
        return ResponseEntity.ok("oh yeah !");
    }
}
