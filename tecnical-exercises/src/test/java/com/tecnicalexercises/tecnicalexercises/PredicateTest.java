package com.tecnicalexercises.tecnicalexercises;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Predicate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PredicateTest {
    
    @Test
    public void initialTests(){

        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        Predicate<Integer> evenNumber = (i) -> i % 2 == 0;
        
        assertTrue(greaterThanTen.and(evenNumber).test(12));
        assertFalse(greaterThanTen.and(evenNumber).test(11));
        assertFalse(greaterThanTen.and(evenNumber).test(9));
    }
}
