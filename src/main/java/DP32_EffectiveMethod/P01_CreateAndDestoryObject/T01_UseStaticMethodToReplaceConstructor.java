package DP32_EffectiveMethod.P01_CreateAndDestoryObject;

/*
    @名称: 使用静态方法来代替构造方法
    @描述: 为了让客户端获取它自身的一个实例，最常用的方法就是提供一个公有的构造器。
          还有一种方法，也应该在每个程序员的工具箱中占有一席之地。类可以提供一个公有的 静态工厂方法 （static factory method）
    @注意: 静态工厂方法与设计模式[Gamma95，p.107]中的工厂方法模式不同
    @优点: 第一大优势在于，它具有名称。适当名称的静态工厂会更容易使用，产生的客户端代码也更易于阅读。
          第二大优势在于，不必在每次调用它们的时候都创建一个新对象。
          第三大优势在于，它可以返回任意其他类型，但是一般还是返回原类型的包装或者子类型。
    @缺点: 主要缺点在于，类如果不含有公有的或者受保护的构造器，就不能被子类化。
          第二个缺点在于，它们与其他的静态方法实际上没有任何区别。 在API文档中，没有像构造器那样在API文档中明确标识出来。
    @例如: +1 例如，构造器  BigInteger(int, int, Random)  返回的  BigInteger  可能为素数，
                    如果用名为  BigInteger.probablePrime  的静态工厂方法来表示，显然更为清楚。”
             (补充说明优点1)
          +2 例如，Boolean.valueOf(boolean)  方法说明了这项技术
             (补充说明优点2)
          +3 例如，Java Collections Framework的集合接口
             (补充说明优点3)
 */
public class T01_UseStaticMethodToReplaceConstructor {

    public static void main(String[] args) {
        boolean val = true;
        Boolean result = MyBool.valueOf(val);
        System.out.println(result);
        System.out.println(MyBool.valueOf(false));
    }

}

class MyBool {
    static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
