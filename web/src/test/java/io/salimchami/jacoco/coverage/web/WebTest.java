package io.salimchami.jacoco.coverage.web;

import io.salimchami.jacoco.coverage.dao.Dao;
import io.salimchami.jacoco.coverage.domain.Domain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WebTest {

    private Web web;

    @BeforeEach
    public void setUp() {
        Dao dao = new Dao();
        Domain domain = new Domain(dao);
        web = new Web(domain);
    }

    @Test
    public void coveredByUnitTest() {
        web.coveredByUnitTest();
    }
}
