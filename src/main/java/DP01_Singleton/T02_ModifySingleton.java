package DP01_Singleton;

/**
 * 懒汉式
 * 有线程安全性问题
 */

public class T02_ModifySingleton {
    private static T02_ModifySingleton INSTANCE;

    private T02_ModifySingleton() {}

    public static T02_ModifySingleton getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new T02_ModifySingleton();
        }
        return INSTANCE;
    }

    // 验证是否是只有一个
    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            new Thread(() -> {
                System.out.println(T02_ModifySingleton.getInstance().hashCode());
            }).start();
        }
    }
}
