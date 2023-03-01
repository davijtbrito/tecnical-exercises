package com.tecnicalexercises.tecnicalexercises.threads;

public class SharedValueThread implements Runnable{

    private ISharedValue sharedValue;    

    public SharedValueThread(ISharedValue sharedValue) {
        this.sharedValue = sharedValue;
    }

    @Override
    public void run() {
        
        for(int i = 1; i <= 1000; i++){
            this.sharedValue.increment();
        }
    }    
    
}
