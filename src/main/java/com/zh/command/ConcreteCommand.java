package com.zh.command;

/**
 * 具体命令对象
 * 持有接受者一个实例
 * Created by zh on 2017-12-11.
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
