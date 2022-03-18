package com.ql.pattern.singleton.demo2;

/**
 * 饿汉式 静态代码块
 *
 * @author wanqiuli
 * @date 2022/3/18 1:20 下午
 */
public class Singleton {

    private static final Singleton singleton;

    private Singleton() {
    }

    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
