package com.zh.command;

/**
 * Created by zh on 2017-12-11.
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        //这里Invoker不需要知道接受命令的对象是谁
        //仅需要知道命令对象就可以了
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
