package com.github.datastructureandalgorithm.dynamic_array;

public class Array {

    private int[] data;
    private int size;

    /**
     * @param capacity 用户传入 capacity 指定数组的容量
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 无参构造函数
     */
    public Array() {
        this(10);
    }

    /**
     *
     * @return 数组中元素的个数
     */
    public int getSize() {
        return size;
    }

    /**
     *
     * @return 数组的容量
     */
    public int getCapacity() {
        return data.length;
    }


    public boolean isEmpty() {
        return size == 0;
    }

}
