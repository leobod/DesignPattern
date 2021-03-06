package DP18_Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录类
 */
public class Memento {
    /**
     * 所持金钱
     */
    private int money;
    /**
     * 获得的水果
     */
    private List<String> fruits;

    /**
     * 获取当前所持金钱
     *
     * @return 所持金钱
     */
    public int getMoney() {
        return money;
    }

    /**
     * 构造方法，初始化所持钱数
     *
     * @param money 初始化钱数
     */
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    /**
     * 添加水果
     *
     * @param fruit 水果
     */
    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    /**
     * 添加当前所持的所有水果
     *
     * @return 水果列表
     */
    List<String> getFruits() {
        return fruits;
    }
}
