package DP12_Vistor;

public class USB implements HardwareInterface {
    @Override
    public void visitor(CPU cpu) {
        System.out.println("usb连接cpu");
    }

    @Override
    public void visitor(Screen vCard) {
        System.out.println("用usb连接显卡");
    }

    @Override
    public void visitor(HardDisk hd) {
        System.out.println("用usb连接硬盘");
    }
}
