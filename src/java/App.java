/*
 * App.java 2018年3月21日
 * Copyright (c) 2015-2018, Jv Bo (programmer_jv_bo@163.com).
 */
package java;

/**
 * @ClassName: App 
 * @Description: 一些情况测试
 * @author jvbo
 * @date 2018年3月21日
 */
public class App {

    static final int tableSizeFor(int cap) {
        int MAXIMUM_CAPACITY = 1 << 30;
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
    
    public static void main(String[] args) {
        System.out.println(tableSizeFor(5));
    }
}
