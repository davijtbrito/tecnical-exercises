package com.tecnicalexercises.tecnicalexercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
class Product implements Comparable<Product>{
    
    @Getter
    private Integer id;

    @Getter
    private String name;

    @Override
    public int compareTo(Product o) {        

        if (this.getId() > o.getId()){
            return 1;

        } else{
            return -1;
        }        
    }    
}

@AllArgsConstructor
class Prod {

    @Getter
    private Integer id;

    @Getter
    private String name;
}

@SpringBootTest
public class SortTest {    

    @Test
    public void sortExample01(){

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(11);
        intList.add(9);
        
        Collections.sort(intList);

        assertEquals(9, intList.get(0));
        assertEquals(10, intList.get(1));
        assertEquals(11, intList.get(2));        
    }

    @Test
    public void sortExample02(){

        List<Product> prodList = new ArrayList<>();
        prodList.add(new Product(2, "Product B"));
        prodList.add(new Product(3, "Product C"));
        prodList.add(new Product(1, "Product A"));
        
        Collections.sort(prodList);//this only works because the class Product implements Comparable<T>       
     
        assertEquals(1, prodList.get(0).getId());
        assertEquals(2, prodList.get(1).getId());
        assertEquals(3, prodList.get(2).getId());
    }

    @Test
    public void sortExample03(){

        List<Prod> prodList = new ArrayList<>();
        prodList.add(new Prod(2, "Prod B"));
        prodList.add(new Prod(3, "Prod C"));
        prodList.add(new Prod(1, "Prod A"));
        
        Comparator<Prod> com = new Comparator<Prod>() {
            public int compare(Prod p1, Prod p2){

                //Implementing the same logic that in Product.compareTo()
                if (p1.getId() > p2.getId()){
                    return 1;
        
                } else{
                    return -1;
                }        
            }
        };

        Collections.sort(prodList, com);       
     
        assertEquals(1, prodList.get(0).getId());
        assertEquals(2, prodList.get(1).getId());
        assertEquals(3, prodList.get(2).getId());
    }
}
