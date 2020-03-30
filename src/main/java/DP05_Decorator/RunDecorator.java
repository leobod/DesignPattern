package DP05_Decorator;

public class RunDecorator {
    public static void main(String[] args) {
        Tank tank = new Tank();

        Decorator decorator = new BloodDecorator(tank);

        decorator.paint();
    }
}
