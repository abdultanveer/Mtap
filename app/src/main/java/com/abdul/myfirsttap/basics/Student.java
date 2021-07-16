package com.abdul.myfirsttap.basics;

public class Student {

    String name;
    int age;
    boolean isMale;
    final static String COLLEGE_NAME = "IIT";

    void calculateElgi(){
        int a  = 10;
       // COLLEGE_NAME = "NIT";
    }
    public Student(String name, int paramAge, boolean isMale) {//ashish=constructor= name = class name
        this.name = name;
        this.age = paramAge;
        this.isMale = isMale;
        // this. calculateElgi();
    }

    public  int add(int a, int b){
        return  a+b;
    }


}
