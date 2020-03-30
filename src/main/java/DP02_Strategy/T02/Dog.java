package DP02_Strategy.T02;

public class Dog implements CustomComparable<Dog> {
    int height;
    private Dog t;

    public Dog(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Dog t) {
        Dog d = t;
        if (this.height < d.height) return -1;
        else if (this.height > d.height) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                '}';
    }
}
