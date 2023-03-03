package com.tecnicalexercises.tecnicalexercises;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SetTest {
    
    @Test
    public void testingSet(){

        Set<Integer> values = new HashSet<>();

        System.out.println(values.add(5));//true
        System.out.println(values.add(6));//true
        System.out.println(values.add(7));//true
        System.out.println(values.add(6));//false 

        for(Integer i : values){
            System.out.println(i);// {5, 6, 7}
        }
    }
}
