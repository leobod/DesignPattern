package DP01_Singleton;

/**
 * 修改T03
 * 2次检查，缩短加锁块的大小
 */

public class T04_Singleton {
    private static volatile T04_Singleton INSTANCE;

    private T04_Singleton() {}

    public static T04_Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (T04_Singleton.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new T04_Singleton();
                }
            }
        }
        return INSTANCE;
    }


    // 验证是否是只有一个
    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            new Thread(() -> {
                System.out.println(T04_Singleton.getInstance().hashCode());
            }).start();
        }
    }
}
