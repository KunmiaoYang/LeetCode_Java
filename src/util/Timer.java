package util;

import java.io.PrintStream;

/**
 * Created by kunmiao.yang on 2017/5/4.
 */
public class Timer {
    long startTime, endTime;

    public Timer() {
        startTime=System.currentTimeMillis();
    }

    public void stop() {
        endTime=System.currentTimeMillis();
    }

    public void output(PrintStream out) {
        out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
