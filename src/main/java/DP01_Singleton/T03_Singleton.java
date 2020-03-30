package DP01_Singleton;

/**
 * 修改T02
 * 通过加锁解决线程安全
 */

public class T03_Singleton {
    private static T03_Singleton INSTANCE;

    private T03_Singleton() {}

    public static synchronized T03_Singleton getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new T03_Singleton();
        }
        return INSTANCE;
    }


    // 验证是否是只有一个
    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            new Thread(() -> {
                System.out.println(T03_Singleton.getInstance().hashCode());
            }).start();
        }
    }

}
