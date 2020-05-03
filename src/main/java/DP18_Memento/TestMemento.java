package DP18_Memento;


public class TestMemento {
    /**
     * 测试备忘录模式
     */
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 20; i++) {
            System.out.println("==== " + i);
            System.out.println("当前状态：" + gamer);
            // 投掷骰子
            gamer.bet();

            System.out.println("所持金钱为" + gamer.getMoney() + "元。");
            // 如何处理memento
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    （所持金钱增加了许多，因此保存游戏当前的状态）");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    （所持金钱减少了许多，因此将游戏恢复至以前的状态）");
                gamer.restoreMemento(memento);
            }

            // 等待一段时间
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }
}
