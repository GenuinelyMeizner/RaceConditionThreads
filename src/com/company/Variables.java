package com.company;

public class Variables extends Thread {

    public static int x = 0;

    public Variables() {

    }

    public void run() {
        for(int i = 0; i <= 100000; i++) {
            x = x + 1;
        }
    }
}
