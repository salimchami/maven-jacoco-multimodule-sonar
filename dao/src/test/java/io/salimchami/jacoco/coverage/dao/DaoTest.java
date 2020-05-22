package io.salimchami.jacoco.coverage.dao;

import org.junit.jupiter.api.Test;

public class DaoTest {

  @Test
  public void coveredByUnitTest() {
    Dao dao = new Dao();
    dao.coveredByUnitTest();
  }
}
