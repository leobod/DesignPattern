package DP12_Vistor;

public interface HardwareInterface {

    //定义了一些接口，访问硬件用的
    public void visitor(CPU cpu);
    public void visitor(Screen vCard);
    public void visitor(HardDisk hd);

}
