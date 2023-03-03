package com.tecnicalexercises.tecnicalexercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HashTest {
    
    @Test
    public void hastMapTest(){

        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("Davi1", "962091571");//this is called an Entry
        phonebook.put("Davi2", "962091572");
        phonebook.put("Davi1", "962091573");

        Set<String> names = phonebook.keySet();
        for(String name : names){
            System.out.println(name + ": " + phonebook.get(name));//it will print Davi1 and Davi2
        }

        Set<Map.Entry<String, String>> values = phonebook.entrySet();

        System.out.println("Getting Entries");
        for(Map.Entry<String, String> e : values){

            System.out.println(e.getKey() + ": " + e.getValue());
        }  
    }
}
