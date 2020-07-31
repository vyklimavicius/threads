package com.klimavicius;

import static com.klimavicius.ThreadColor.ANSI_GREEN;
import static com.klimavicius.ThreadColor.ANSI_PURPLE;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main Thread!");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

//        Runnable runnable = new MyRunnable();
//        runnable.run();

        // Anonymous class
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class!");
            }
        }.start();

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main Thread!");

//        System.out.println(ThreadColor.Color.RED);


    }
}
