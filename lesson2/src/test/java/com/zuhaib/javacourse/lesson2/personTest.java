package com.zuhaib.javacourse.lesson2;
import com.zuhaib.javacourse.lesson10.LoggingLevel;
import com.sun.javafx.util.Logging;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class personTest {

    static final String[] MY_STATE_VALUE = {"PENDING", "PROCESSED", "PROCESSING"};

    @Test
    public void shouldReturnHelloWorld(){
        person zuhaib = new person();
        assertEquals("Hello World",zuhaib.helloWorld() );
    }

    @Test
    public void shouldReturnHelloZuhaib(){
        person zuhaib1 = new person();
        assertEquals("Hello zuhaib",zuhaib1.hello("zuhaib") );
    }
    @Test
    public void shouldReturnNumberOfPerson(){
        person person1 = new person();
        person person2 = new person();
        person person3 = new person();
        person person4 = new person();
        assertEquals(4,person.numberOfPerson() );
    }
    @Test
    public void demonstrateArrays(){
        person[] persons = new person[4];
        for(int i = 0; i < persons.length; i ++) {
            persons[i] = new person();
        }
        for( person person1 : persons){
            person1.helloWorld();
        }
        person myPerson = new person();
        person myPerson2 = null;
        final person[] persons2 = { persons[0], null , myPerson , myPerson2 };

        for(LoggingLevel state: LoggingLevel.values() ){
            if(state == LoggingLevel.PENDING){
            }
            if(state == LoggingLevel.PROCESSED){
            }
            if(state == LoggingLevel.PROCESSING){
            }
        }
    }
}
