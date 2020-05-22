package io.salimchami.jacoco.coverage.domain;

import io.salimchami.jacoco.coverage.dao.Dao;

public class Domain {

  public void coveredByUnitTest() {
    final Dao dao = new Dao();
    dao.coveredByUnitTest();
    show1();
    show2();
    show3();
    show4();
    show5();
  }

  private void show1() {
    System.out.println("1");
  }

  private void show2() {
    System.out.println("2");

  }

  private void show3() {
    System.out.println("3");

  }

  private void show4() {
    System.out.println("4");

  }

  private void show5() {
    System.out.println("5");

  }

  public void coveredByIntegrationTest() {
    new Dao().coveredByIntegrationTest();
    System.out.println("This method is covered by integration test");
  }

  public void uncovered() {
    System.out.println("This method is not covered");
  }
}
