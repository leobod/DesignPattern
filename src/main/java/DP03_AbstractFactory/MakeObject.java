package DP03_AbstractFactory;

import DP03_AbstractFactory.Factory.AbstractFactory;
import DP03_AbstractFactory.Factory.ModerFactory;
import DP03_AbstractFactory.Factory.OldFactory;

public class MakeObject {
    public static void main(String[] args) {
        AbstractFactory af1 = new ModerFactory();
        AbstractFactory af2 = new OldFactory();

        System.out.println("Modern: ");
        af1.createFood().printName();
        af1.createWeapon().printName();

        System.out.println("");

        System.out.println("Old: ");
        af2.createFood().printName();
        af2.createWeapon().printName();
    }
}
