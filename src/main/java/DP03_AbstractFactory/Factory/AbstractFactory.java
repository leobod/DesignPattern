package DP03_AbstractFactory.Factory;

import DP03_AbstractFactory.MyObject.Food;
import DP03_AbstractFactory.MyObject.Weapon;

public abstract class AbstractFactory {
    abstract public Food createFood();

    abstract public Weapon createWeapon();
}
