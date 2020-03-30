package DP05_Decorator;

public class Decorator extends GameObject {
    public GameObject object;

    public Decorator(GameObject object) {
        this.object = object;
    }

    @Override
    public void paint() {
        object.paint();
    }
}
