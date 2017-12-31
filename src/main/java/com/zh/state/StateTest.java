package com.zh.state;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by zh on 2017-12-15.
 */
public class StateTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        Context context = new Context(new IdleState());
//        for(;;) {
//            context.clientRequest();
//        }
        context.clientRequest();
        System.out.println("完成...");
        TimeUnit.SECONDS.sleep(2);
        context.clientRequest();
        TimeUnit.SECONDS.sleep(10);
    }
}
