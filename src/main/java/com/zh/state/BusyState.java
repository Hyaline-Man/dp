package com.zh.state;

/**
 * 忙状态，经过一段时间后会空闲下来
 * Created by zh on 2017-12-15.
 */
public class BusyState implements State {

    private long time = System.currentTimeMillis();

    @Override
    public void doAction(Context context) {
        System.out.println("当前状态忙！请稍后再拨。。");
        while ((System.currentTimeMillis() - time) < 40) {
        }
        context.changeState(new IdleState());
    }
}
