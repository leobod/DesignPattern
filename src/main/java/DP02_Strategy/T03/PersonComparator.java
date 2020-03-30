package DP02_Strategy.T03;

import DP02_Strategy.T01.Dog;

public class PersonComparator implements MyComparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.height < o2.height) return -1;
        else if (o1.height > o2.height) return 1;
        else return 0;
    }
}
