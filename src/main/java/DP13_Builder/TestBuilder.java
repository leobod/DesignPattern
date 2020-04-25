package DP13_Builder;

/**
 *  Builder模式
 *
 *  分步骤来构建数据，简单理解为分成buildX
 *
 *  所有buildX都构建完成，在build来返回/生成最终的对象。
 *
 *  用于： 分步骤构建对象。
 */

public class TestBuilder {
    public static void main(String[] args) {
        MyGoods myGoods = new MyGoodsBuilder().buildA().buildB().build();
        System.out.println(myGoods.toString());
    }
}
