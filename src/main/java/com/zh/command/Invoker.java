package com.zh.command;

/**
 * 请求者对象
 * 持有命令对象实例
 * Created by zh on 2017-12-11.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
