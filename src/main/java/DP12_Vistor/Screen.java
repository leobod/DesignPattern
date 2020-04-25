package DP12_Vistor;

public class Screen extends ComputerPart {
    @Override
    protected void link(HardwareInterface hardwareInterface) {

        // 必须先用接口连接上显卡
        hardwareInterface.visitor(this);

        System.out.println("连接上显示器之后，显示器开始工作，提供图像");
    }
}
