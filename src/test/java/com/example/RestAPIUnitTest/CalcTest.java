package com.example.RestAPIUnitTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalcTest {
    Calc calc;
    //Calc calc = new Calc();

    @BeforeEach
    void setUp(){
        calc = new Calc();
    }


    @Test
    @Order(1)
    void testSubtract(){
//        calc = new Calc();
//        Calc c = new Calc();
        int expectedResult = 5;
        int actualResult = calc.subtract(10,5);
        //int anotherResult = c.subtract(10,5);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @Disabled
    @Order(2)
    void testProduct(){
        assertEquals(20, calc.product(5,4));
        System.out.println(calc.product(5,4));
    }

    @Test
    @Order(3)
    void sumTest(){
        assertEquals(10,calc.sum(5,5));
    }
}
