package io.salimchami.jacoco.coverage.web;

import io.salimchami.jacoco.coverage.dao.Dao;
import io.salimchami.jacoco.coverage.domain.Domain;
import org.junit.jupiter.api.Test;

public class WebIT {

    @Test
    public void integrationTest1() {
        new Dao().coveredByIntegrationTest();
    }

    @Test
    public void integrationTest2() {
        new Domain().coveredByIntegrationTest();
    }


    @Test
    public void integrationTest3() {
        new Web().coveredByIntegrationTest();
    }
}
