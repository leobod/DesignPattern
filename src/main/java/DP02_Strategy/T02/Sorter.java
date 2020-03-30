package DP02_Strategy.T02;

public class Sorter<T extends CustomComparable<T>> {
    public void sort(T[] data) {
        for (int i = 0; i < data.length - 1; i++) {// 控制趟数
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].compareTo(data[j + 1]) == 1) {
                    T tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog(3), new Dog(5), new Dog(1)};
        Sorter s = new Sorter();
        s.sort(dogs);
        for (Dog dog: dogs) {
            System.out.print(dog.toString());
        }
    }
}
