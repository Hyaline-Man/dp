package com.zh.state;

/**
 * 空闲状态
 * Created by zh on 2017-12-15.
 */
public class IdleState implements State {

    private long start = System.currentTimeMillis();

    @Override
    public void doAction(Context context) {
        System.out.println("正在帮您转接通话。。。");
        while ((System.currentTimeMillis() - start) < 5) {
        }
        context.changeState(new BusyState());
    }
}
