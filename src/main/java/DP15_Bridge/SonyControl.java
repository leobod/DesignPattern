package DP15_Bridge;

/**
 * Sony为自己的电视规定的遥控方式
 */
public class SonyControl implements Control{
    @Override
    public void On(){
        System.out.println("Sony on");
    }
    @Override
    public void Off(){
        System.out.println("Sony off");
    }
}
