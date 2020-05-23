package io.salimchami.jacoco.coverage.domain;

import io.salimchami.jacoco.coverage.dao.Dao;
import org.junit.jupiter.api.Test;

public class DomainTest {

    @Test
    public void coveredByUnitTest() {
        Dao dao = new Dao();
        new Domain(dao).coveredByUnitTest();
    }
}
