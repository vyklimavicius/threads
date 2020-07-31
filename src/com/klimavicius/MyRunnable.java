package com.klimavicius;

import static com.klimavicius.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from my runnable!");
    }
}
