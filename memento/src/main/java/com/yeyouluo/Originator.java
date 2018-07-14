package com.yeyouluo;

/**
 * 发起人，负责创建一个备忘录，记录及恢复备忘录内部状态。
 * @Auther: yeyouluo
 * @Date: 2018/7/14
 */
public class Originator {
    private String state;

    /**
     * 创建备忘录
     * @return
     */
    public Memento createMemento(){
        return new Memento(state);
    }

    /**
     * 恢复备忘录
     * @param memento
     */
    public void resetMemento(Memento memento) {
        this.state = memento.getState();
    }

    /**
     * 显示数据
     * @return
     */
    public void show() {
        System.out.println( "Caretaker{" +
                "state='" + state + '\'' +
                '}');
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
