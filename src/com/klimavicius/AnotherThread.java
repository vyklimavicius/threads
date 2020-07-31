package com.klimavicius;

import static com.klimavicius.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from Another Thread!");
    }
}
