package DP02_Strategy.T03;

import DP02_Strategy.T02.Cat;
import DP02_Strategy.T02.CustomComparable;

public class Sorter<T> {
    public void sort(T[] data, MyComparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {// 控制趟数
            for (int j = 0; j < data.length - i - 1; j++) {
                if (comparator.compare(data[j], data[j + 1]) == 1) {
                    T tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Person[] people = {new Person(3), new Person(5), new Person(1)};
        Sorter sorter = new Sorter();
        MyComparator<Person> comparator = new PersonComparator();

        sorter.sort(people, comparator);

        for (Person p : people) {
            System.out.println(p.toString());
        }
    }
}
