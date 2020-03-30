package DP01_Singleton;

public enum T06_EnumSingleton {
    INSTANCE;

    // 验证是否是只有一个
    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            new Thread(() -> {
                System.out.println(T03_Singleton.getInstance().hashCode());
            }).start();
        }
    }
}
