package DP02_Strategy.T02;

public class Cat implements CustomComparable<Cat> {
    int height;
    private Cat t;

    public Cat(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Cat d) {
        if (this.height < d.height) return -1;
        else if (this.height > d.height) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                '}';
    }
}
