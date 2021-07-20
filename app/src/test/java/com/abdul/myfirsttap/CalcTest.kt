package com.abdul.myfirsttap

import junit.framework.TestCase
import org.junit.Test

class CalcTest : TestCase(){

    @Test
    fun test_add(){
        var calc = Calc()
        var expected = 30
        var actual = calc.add(10,20)

        assertEquals(expected,actual)


    }
}