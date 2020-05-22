package io.salimchami.jacoco.coverage.web;

import io.salimchami.jacoco.coverage.domain.Domain;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web {

    public void coveredByUnitTest() {
        final Domain domain = new Domain();
        domain.coveredByUnitTest();
        System.out.println("module 3 covered by unit test");
    }

    public void coveredByIntegrationTest() {
        final Domain domain = new Domain();
        domain.coveredByIntegrationTest();
        System.out.println("module 3 covered by integration test");
    }

}
