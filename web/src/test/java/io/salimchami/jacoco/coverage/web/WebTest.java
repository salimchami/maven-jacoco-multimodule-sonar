package io.salimchami.jacoco.coverage.web;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebTest {

    @Test
    void coveredByUnitTest() {
        new Web().coveredByUnitTest();
    }
}
