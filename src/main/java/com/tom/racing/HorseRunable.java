package com.tom.racing;

public class HorseRunable implements Runnable{
    public void run(){
        for(int i = 0;i<10000 ; i++)
        {
            System.out.println("RR " + i);
        }
    }
}
