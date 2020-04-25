package DP12_Vistor;

/**
 *  Vistor模式
 *
 *  可以类比买电脑
 *
 *  对于不同的人，组装电脑时候使用的配件的不同，最后的价格当然也不同
 */

public class TestVistor {
    public static void main(String[] args) {

        //想要装机，先得装电脑的架子
        Computer computer=new Computer();
        //有架子后，就想着用什么接口去装电脑，这里是用usb接口去连接里面的硬件的。当然，也可以去换成其他接口
        computer.useComputer(new USB());
    }
}
