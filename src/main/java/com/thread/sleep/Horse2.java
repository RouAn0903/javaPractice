package com.thread.sleep;

import java.io.IOException;

public class Horse2 extends Thread{
    @Override
    public void run() {
        try{
            sleep(2000);
            System.out.println(getName()+" Finish");

        }catch(InterruptedException e){
            System.out.println("Interruption!!!");
        }
    }
}
