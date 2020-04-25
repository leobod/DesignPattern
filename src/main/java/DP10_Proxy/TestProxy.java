package DP10_Proxy;

/**
 * 代理模式
 *
 * 与包装，门面都很像，就是多态的应用
 *
 * 通过设置代理XxxProxy，为某个具体的Xxx，的方法添加前置/后置/环绕等
 *
 * 在Spring中，主要用在AOP中，有JDKProxy与CGlib方式
 *
 * 本例子中，使用自己构造的Proxy，相比用反射的，显得简单
 *
 */

public class TestProxy {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImp();
        buyHouse.buyHosue();

        System.out.println("--------- 分割线 --------");

        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHosue();
    }
}
