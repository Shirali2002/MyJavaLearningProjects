package main.threadSynchronized;

import main.thread.*;
import java.util.ArrayList;
import java.util.List;

public class Base {

    private static int a = 0;

    public static int getA() {
        return a;
    }

    public synchronized static void incA() {
        Base.a++;
    }


}
