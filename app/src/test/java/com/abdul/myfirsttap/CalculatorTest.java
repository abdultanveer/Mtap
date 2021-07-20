package com.abdul.myfirsttap;

import junit.framework.TestCase;

import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void test_add(){
        int expected = 40;
        int actual = Calculator.add(10,20);
        assertEquals(expected,actual);
    }
}