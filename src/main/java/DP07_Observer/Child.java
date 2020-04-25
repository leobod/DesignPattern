package DP07_Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 * 例子中 dad与mom作为观察者，观察Child，当child的cry发生变化时，执行对应的操作
 *
 * 对于Observer，本例子使用的是cry的变化作为依据
 *
 * 对于复杂一点的可以定义事件类， 对于Observer，给方法加参数，要求传入事件对象，来触发观察者来做事。
 */

public class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mom());
    }

    public boolean isCry() {
        return this.cry;
    }

    public void wakeUp() {
        this.cry = true;
        for (Observer o : observers) {
            o.action();
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}
