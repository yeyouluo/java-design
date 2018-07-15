package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        // 构成责任链
        handlerA.setNexthandler(handlerB);
        handlerB.setNexthandler(handlerC);
        handlerC.setNexthandler(new ConcreteHandlerBoss());

        int[] requestArray = {2,5,26,7,39,18,27,-100,16,25};
        for ( int req : requestArray ) {
            // 给权限最小的handlerA处理
            handlerA.handleRequest(req);
        }
    }
}
