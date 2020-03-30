package DP05_Decorator;

public class BloodDecorator extends Decorator {

    public BloodDecorator(GameObject object) {
        super(object);
    }


    @Override
    public void paint() {
        super.paint();
        System.out.println("Paint Blood");
    }
}
