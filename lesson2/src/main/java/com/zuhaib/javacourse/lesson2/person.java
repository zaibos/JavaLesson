package com.zuhaib.javacourse.lesson2;
import com.zuhaib.javacourse.lesson3.Name;

public class person {
    private Name personName;
    private static int personCounter;

    public person(Name personName){
        this.personName=personName;
    }

    public person(){
        personCounter++;
        /*
        default constructor
         */
    }

    public String helloWorld(){
        return "Hello World";
    }
    public String hello(String name){
        return "Hello " + name;
    }
    public static int numberOfPerson(){
        return personCounter;
    }
}
