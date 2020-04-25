package DP17_Prototype;

/**
 * 原型
 *
 * 类比javascript
 *
 * 原型是用来生成实例的，但不是利用类来生成实例，而是通过实例来生成实例。
 */

public class TestPrototype {
    public static void main(String[] args) {

        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
