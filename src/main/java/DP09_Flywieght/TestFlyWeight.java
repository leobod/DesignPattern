package DP09_Flywieght;

/**
 * 享元模式
 *
 * 以下的情况下可以适用享元模式。
 * •应用程序中大量存在相同或相似状态的对象时。
 * •由于应用程序功能方面的需求，需要在不同对象之间共享数据或对象时。
 */

public class TestFlyWeight {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        System.out.println(factory.getFlyweight("hello world").getMsg());
    }
}
