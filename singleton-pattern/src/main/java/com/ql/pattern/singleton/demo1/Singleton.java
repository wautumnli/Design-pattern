package com.ql.pattern.singleton.demo1;

/**
 * 饿汉式
 *
 * @author wanqiuli
 * @date 2022/3/18 1:11 下午
 */
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    /**
     * 构造器私有
     */
    private Singleton() {
    }

    /**
     * 静态方法获取
     *
     * @return the {@link Singleton} data
     */
    public static Singleton getInstance() {
        return SINGLETON;
    }

}
