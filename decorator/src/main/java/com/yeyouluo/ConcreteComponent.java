package com.yeyouluo;

public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("具体操作的对象");
    }
}
