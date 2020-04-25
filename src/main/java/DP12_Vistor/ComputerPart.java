package DP12_Vistor;

public abstract class ComputerPart {

    /**
     * 所有的 零配件，都必须通过一个硬件接口进行连接
     * @param hardwareInterface
     */
    protected abstract void link(HardwareInterface hardwareInterface);

}
