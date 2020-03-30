package DP01_Singleton;

/**
 * 第一种，单例模式
 * 具有线程安全性，因为JVM加载类，自会加载一次
 * 但是这个方法是类加载时就实例化
 * 多数情况下这样就OK了
 */

public class T01_ClassicSingleton {
    private static T01_ClassicSingleton INSTANCE = new T01_ClassicSingleton();

    private T01_ClassicSingleton() {}

    public static T01_ClassicSingleton getInstance() {
        return INSTANCE;
    }


    // 验证是否是只有一个
    public static void main(String[] args) {
        T01_ClassicSingleton s1 = T01_ClassicSingleton.getInstance();
        T01_ClassicSingleton s2 = T01_ClassicSingleton.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);           // true 且 hashcode一致，表明确实是只有一个

    }
}
