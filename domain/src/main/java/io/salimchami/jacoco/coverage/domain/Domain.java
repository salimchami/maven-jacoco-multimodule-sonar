package io.salimchami.jacoco.coverage.domain;

import io.salimchami.jacoco.coverage.dao.Dao;
import org.springframework.stereotype.Service;

@Service
public class Domain {

    private final Dao dao;

    public Domain(Dao dao) {
        this.dao = dao;
    }

    public void coveredByUnitTest() {
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
        dao.coveredByIntegrationTest();
        System.out.println("This method is covered by integration test");
    }

    public void uncovered() {
        System.out.println("This method is not covered");
    }
}
