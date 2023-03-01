package com.tecnicalexercises.tecnicalexercises.threads;

public class SharedValues implements ISharedValue{
    
    private int total = 0;

    public synchronized void increment(){
        this.total++;
    }

    public int getTotal() {
        return total;
    }    
}
