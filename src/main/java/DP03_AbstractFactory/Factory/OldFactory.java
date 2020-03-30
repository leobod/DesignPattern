package DP03_AbstractFactory.Factory;

import DP03_AbstractFactory.MyObject.*;

public class OldFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Weapon createWeapon() {
        return new Arrow();
    }
}
