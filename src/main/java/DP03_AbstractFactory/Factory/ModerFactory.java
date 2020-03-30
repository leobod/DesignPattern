package DP03_AbstractFactory.Factory;

import DP03_AbstractFactory.MyObject.*;

public class ModerFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new Rice();
    }

    @Override
    public Weapon createWeapon() {
        return new Ak47();
    }

}
