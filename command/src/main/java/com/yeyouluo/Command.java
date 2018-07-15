package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public  abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}

class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.operate();
    }
}
