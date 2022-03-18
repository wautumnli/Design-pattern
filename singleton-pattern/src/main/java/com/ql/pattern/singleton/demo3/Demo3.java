package com.ql.pattern.singleton.demo3;

/**
 * @author wanqiuli
 * @date 2022/3/18 1:25 下午
 */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}
