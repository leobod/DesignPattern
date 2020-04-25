package DP12_Vistor;

public class Computer {

    /**
     * 想装机，先得提供硬件接口才行
     * @param hardwareInterface
     */
    public void useComputer(HardwareInterface hardwareInterface){

        //通过接口，连接cpu
        new CPU().link(hardwareInterface);
        //通过接口，连接显卡
        new Screen().link(hardwareInterface);
        //通过接口连接硬盘
        new HardDisk().link(hardwareInterface);

    }
}
