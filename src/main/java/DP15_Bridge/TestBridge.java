package DP15_Bridge;

/**
 * Bridge桥接模式
 *
 * 对与要桥接的Control，设计Interface,对于具体的实现由子类实现
 *
 * 对于桥接对象，通过注入Control来在具体的方法中，调用 Control的接口定义的方法。
 *
 *
 *
 * 目的
 * 将抽象部分和他的实现相分离，是他们都可以独立的变化。
 *
 * 使用场景
 * 不希望在抽象类和他的实现部分之间有一个固定的绑定关系。
 * 类的抽象和他的视线都想要能够通过生成子列的方式加以扩充的时候。
 * 对于一个抽象的实现部分的修改不会对于外部的客户产生影响。
 * 对与调用者隐藏抽象部分。
 *
 */

public class TestBridge {
    public static void main(String[] args){
        TVControl mLGContol;
        TVControl mSonyControl;
        mLGContol = new TVControl(new LGControl());
        mLGContol.OnOff();
        mLGContol.OnOff();


        mSonyControl = new TVControl(new SonyControl());
        mSonyControl.OnOff();
        mSonyControl.OnOff();
    }
}
