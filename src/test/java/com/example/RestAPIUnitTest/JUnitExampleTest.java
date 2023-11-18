package com.example.RestAPIUnitTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnitExampleTest {

    @Test
    void demoTest(){
        assertTrue(true);
    }

    Calc c = new Calc();

    @Test
    void testSum(){
        int expectedResult = 4;
        int actualResult = c.sum(2,2);
        System.out.println("actualResult is======== " + actualResult);

        assertThat(actualResult).isEqualTo(expectedResult);

    }
}
