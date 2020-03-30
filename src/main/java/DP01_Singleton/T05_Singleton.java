package DP01_Singleton;

/**
 * 使用静态内部类
 */

public class T05_Singleton {
    static class T05Holder {
        private final static T05_Singleton INSTANCE = new T05_Singleton();
    }

    public static T05_Singleton getInstance() {
        return T05Holder.INSTANCE;
    }


    // 验证是否是只有一个
    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            new Thread(() -> {
                System.out.println(T05_Singleton.getInstance().hashCode());
            }).start();
        }
    }
}
