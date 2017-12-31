package com.zh.state;

/**
 *
 * Created by zh on 2017-12-15.
 */
public class Context {

    private State state;

    public Context(State initState) {
        this.state = initState;
    }
    /**
     * 将客户端请求委托给状态进行处理
     * 状态内部自定义转换
     */
    public void clientRequest() {
        state.doAction(this);
    }

    public void changeState(State state) {
        this.state = state;
    }
}
