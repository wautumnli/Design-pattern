package com.ql.pattern.singleton.demo2;

/**
 * @author wanqiuli
 * @date 2022/3/18 1:21 下午
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}
