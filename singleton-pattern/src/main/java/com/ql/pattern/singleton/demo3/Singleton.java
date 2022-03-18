package com.ql.pattern.singleton.demo3;

/**
 * 懒汉式
 *
 * @author wanqiuli
 * @date 2022/3/18 1:23 下午
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    /**
     * 同步锁
     *
     * @return the {@link Singleton} data
     */
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
