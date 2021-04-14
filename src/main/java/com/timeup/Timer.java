package com.timeup;

public class Timer {
        static void startTimer(int seconds, TimesUp obj) throws Exception{
            Thread.sleep(seconds*1000);
            obj.notifyMe(seconds);
        }

}
