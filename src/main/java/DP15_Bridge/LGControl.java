package DP15_Bridge;

/**
 * LG电视机为自己的电视规定的遥控方式
 */
public class LGControl implements Control{
    @Override
    public void On(){
        System.out.println("LG on");
    }
    @Override
    public void Off(){
        System.out.println("LG off");
    }
}
