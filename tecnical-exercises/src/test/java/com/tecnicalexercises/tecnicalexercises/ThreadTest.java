package com.tecnicalexercises.tecnicalexercises;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tecnicalexercises.tecnicalexercises.threads.SharedValueThread;
import com.tecnicalexercises.tecnicalexercises.threads.SharedValues;


public class ThreadTest {    

    @Test
    public void testThread(){   

        SharedValues sharedValues = new SharedValues();        
        Thread t1 = new Thread(new SharedValueThread(sharedValues));
        Thread t2 = new Thread(new SharedValueThread(sharedValues));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {            
            e.printStackTrace();
        }
        
        assertEquals(2000,  sharedValues.getTotal());               
    }
}
