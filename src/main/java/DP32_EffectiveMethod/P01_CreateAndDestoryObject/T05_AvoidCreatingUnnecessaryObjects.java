package DP32_EffectiveMethod.P01_CreateAndDestoryObject;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/*
    @名称: 避免创建不必要的对象
    @描述: 重用对象而不是在每次需要的时候就创建一个相同功能的新对象。
    @注意: 型如 Long 与 long， 要优先使用基本类型而不是装箱基本类型，要当心无意识的自动装箱 。
    @优点: 性能会更好
    @缺点:
    @例如:
        String s =  new  String( "Hello" );
        // 传递给  String  构造器的参数（“Hello”）本身就是一个  String  实例，功能方面等同于构造器创建的所有对象。
        // 如果这种用法是在一个循环中，或者是在一个被频繁调用的方法中，就会创建出成千上万不必要的  String  实例。

        String s = "Hello"; 
        //只用了一个  String  实例，而不是每次执行的时候都创建一个新的实例。
        // 而且，它可以保证，对于所有在同一台虚拟机中运行的代码，只要它们包含相同的字符串字面常量，该对象就会被重用。


 */
public class T05_AvoidCreatingUnnecessaryObjects {
    static class Person {
        private final Date birthDate;
        private static final Date BOOM_START;
        private static final Date BOOM_END;

        static {
            Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
            BOOM_START = gmtCal.getTime();
            gmtCal.set(1964, Calendar.JANUARY, 1, 0, 0, 0);
            BOOM_END = gmtCal.getTime();
        }

        Person(Date birthDate) {
            this.birthDate = birthDate;
        }

        public boolean isBabyBoomer() {
            return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
        }

    }

}
