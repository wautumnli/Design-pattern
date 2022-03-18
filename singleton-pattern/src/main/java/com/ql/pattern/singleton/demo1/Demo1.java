package com.ql.pattern.singleton.demo1;

/**
 * @author wanqiuli
 * @date 2022/3/18 1:18 下午
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}
