package com.abdul.myfirsttap.basics

class MutableList {
}

fun main(args: Array<String>){
    var mutableList = mutableListOf("Ajay","Vijay","Prakash","Vijay")
    mutableList.add(2,"abdul")
    for(element in mutableList){
        println(element)
    }
    println()
    for(index in 0..mutableList.size-1){
        println(mutableList[index])
    }
}