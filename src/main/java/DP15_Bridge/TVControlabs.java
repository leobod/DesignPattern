package DP15_Bridge;

/**
 * 遥控器厂商实现的抽象类
 */
public abstract class TVControlabs {
    Control tControl = null;

    public TVControlabs(Control control){
        this.tControl = control;
    }

    public abstract void OnOff();
}
