package DP13_Builder;

public class MyGoodsBuilder extends Builder {

    private MyGoods goods = new MyGoods();

    @Override
    Builder buildA() {
        System.out.println("Build A ........");
        goods.setA("AAA");
        return this;
    }

    @Override
    Builder buildB() {
        System.out.println("Build B ........");
        goods.setB("BBB");
        return this;
    }

    @Override
    MyGoods build() {
        return goods;
    }
}
