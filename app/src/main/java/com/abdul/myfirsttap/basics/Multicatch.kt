package com.abdul.myfirsttap.basics

class Multicatch {
}

fun main(args: Array<String>){
    try {
        val a = IntArray(5)
        a[8] = 20
        a[5] = 10 / 0
    }


    catch (e: ArithmeticException) {
        println("arithmetic exception catch")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("array index outofbounds exception")
    }
    catch (e: Exception) {
        println("parent exception class")
    }


    println("code after try catch...")
}