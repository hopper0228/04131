package com.tom.racing1;

import com.tom.racing.HorseRunable;
import org.w3c.dom.html.HTMLTableRowElement;

public class Racing {
    public static void main(String[] args) {
        /*String h1 = "Horse1";
        String h2 = "Horse2";
        for (int i = 0; i < 10000; i++) {
            System.out.println(h1+" "+i);
            System.out.println(h2+" "+i);
        }*/
        Horse h1 = new Horse();
        Horse h2 = new Horse();
        HorseRunnable h3 = new HorseRunnable();
        Thread tr = new Thread(h3);
        tr.start();
        h1.start();
        h2.start();
    }
}
