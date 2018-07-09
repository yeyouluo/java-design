package com.yeyouluo;

public abstract class Decorator extends Component {

    protected Component component;

    @Override
    public void operate() {
        component.operate();
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
