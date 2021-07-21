package com.abdul.myfirsttap.basics

class Trycatch {
}

fun main() {
    try {
        val data = 20 / 0   //may throw exception
        println("get medicine")
    } catch (e: Exception) {
       // e.printStackTrace()
    }
    println("get groceries")
}