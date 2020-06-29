package DP32_EffectiveMethod.P02_ForAllObjectCommonMethod;

/**
 * @名称: 覆盖  equals  时请遵守通用约定
 * @描述:
 *      equals 方法实现了 等价关系（equivalence relation） ：
 *      自反性 (reflexive)
 *          对于任何非 null 的引用值x, x.equals(x) 必须返回true。
 *      对称性 (symmetric)
 *          对于任何非 null 的引用值x和y, 当且仅当y.equals(x)返回true时, x.equals(y)必须返回true。
 *      传递性 (transitive)
 *          对于任何非 null 的引用值x、y和z。如果x.equals(y)返回true，并且 y.equals(z) 也返回true，那么x.equals(z)也必须返回true  。
 *      一致性（consistent）
 *          对于任何非 null 的引用值x和y，只要equals的比较操作在对象中所用的信息没有被修改，多次调用x.equals(x)就会一致地返回true，或者一致的返回false。
 *      对于任何非 null 的引用值x，x.equals(null)必须返回false 
 * @注意:
 *      当你编写完成了  equals  方法之后，应该问自己三个问题：它是不是对称的、传递的、一致的？
 *      并且不要只是自问，还要编写单元测试来检验这些特性！
 * @补充:
 *      得出了以下实现高质量  equals  方法的诀窍：
 *      使用  ==  操作符检查“参数是否为这个对象的引用” 。
 *          如果是，则返回  true  。这只不过是一种性能优化，如果比较操作有可能很昂贵，就值得这么做。
 *      使用  instanceof  操作符检查“参数是否为正确的类型” 。
 *          如果不是，则返回  false  。一般说来，所谓“正确的类型”是指equals方法所在的那个类。
 *          有些情况下，是指该类所实现的某个接口。如果类实现的接口改进了equals约定，允许在实现了该接口的类之间进行比较，那么就使用接口。
 *          集合接口（collection interface）如Set、List、Map和Map.Entry具有这样的特性。
 *      把参数转换成正确的类型 。
 *          因为转换之前进行过  instanceof  测试，所以确保会成功。
 *      对于该类中每个“关键（significant）域，检查参数中的域是否与该对象中对应的域相匹配” 。
 *          如果这些测试全部成功，则返回  true  ；否则返回  false  。
 * @建议:
 *      覆盖  equals  时总要覆盖  hashCode
 *      不要企图让  equals  方法过于智能 。
 *          如果只是简单地测试域中的值是否相等，则不难做到遵守  equals  约定。如果想过度地去寻求各种等价关系，则很容易陷入麻烦之中。
 *      不要将  equals  声明中的  Object  对象替换为其他的类型,这会使分析错误的时候花上数个小时都搞不清为什么它不能正常工作。
 *
 */
public class T08_DefineEquals {

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof T08_DefineEquals) {
            T08_DefineEquals otherObj = (T08_DefineEquals) obj;
            /**
             * 其他操作
             */
        }
        return false;
    }
}

