package DP32_EffectiveMethod.P01_CreateAndDestoryObject;

/*
    @名称: 消除过期的对象引用
    @描述: 对过期引用进行适当的回收
    @注意: 只要类是自己管理内存，就应该警惕内存泄露问题 。一旦元素被释放掉，则该元素中包含的任何对象引用都应该被清空。

 */

import java.util.Arrays;
import java.util.EmptyStackException;

public class T06_EliminateExpiredObjectReferences {
}

class MyStack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public MyStack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object object) {
        ensureCapacity();
        elements[size++] = object;
    }

    public Object pop() {
        if (size == 0) throw new EmptyStackException();
        Object result = elements[--size];
        // modify START
        elements[size] = null;
        // modify END
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

}
