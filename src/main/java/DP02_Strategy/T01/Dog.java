package DP02_Strategy.T01;

public class Dog implements CustomComparable {
    int height;

    public Dog(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Object obj) {
        Dog d = (Dog) obj;
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
