package com.tom.racing1;

public class HorseRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("RR " + i);
        }
    }
}
