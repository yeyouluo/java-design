package com.yeyouluo;

/**
 * 处理请求的接口
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public abstract class Handler {

    protected Handler Nexthandler;

    public void setNexthandler(Handler nexthandler) {
        Nexthandler = nexthandler;
    }

    /**
     * 处理请求的抽象方法
     * @param request
     */
    public abstract void handleRequest(int request);
}


class ConcreteHandlerA extends Handler{

    @Override
    public void handleRequest(int request) {
        if( request >= 0 && request <= 10 ) {
            System.out.println( this.getClass().getName() + "处理了请求" + request);
        }else {
            if( this.Nexthandler != null ) {
                this.Nexthandler.handleRequest(request);
            }
        }
    }
}

class ConcreteHandlerB extends Handler{

    @Override
    public void handleRequest(int request) {
        if( request >= 11 && request <= 20 ) {
            System.out.println( this.getClass().getName() + "处理了请求" + request);
        }else {
            if( this.Nexthandler != null ) {
                this.Nexthandler.handleRequest(request);
            }
        }
    }
}

class ConcreteHandlerC extends Handler{

    @Override
    public void handleRequest(int request) {
        if( request >= 21 && request <= 30 ) {
            System.out.println( this.getClass().getName() + "处理了请求" + request);
        }else {
            if( this.Nexthandler != null ) {
                this.Nexthandler.handleRequest(request);
            }
        }
    }
}
class ConcreteHandlerBoss extends Handler{

    public ConcreteHandlerBoss( ) {
        this.Nexthandler = null;
    }

    @Override
    public void handleRequest(int request) {
        System.out.println( this.getClass().getName() + "：我是大Boss，请求" + request + "在其他节点都无法处理，最终还是我来决定吧");
    }
}