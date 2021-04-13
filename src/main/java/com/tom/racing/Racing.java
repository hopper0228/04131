package com.tom.racing;

public class Racing {
    public static void main(String[] args){
        Horse h1 = new Horse();
        Horse h2 = new Horse();
        HorseRunable h3 = new HorseRunable();
        Thread tr = new Thread(h3);
        tr.start();
        h1.start();
        h2.start();
    }
}
