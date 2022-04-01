package com.ql.pattern.factorymethod.demo2;

/**
 * @author wanqiuli
 * @date 2022/4/1 12:54
 */
public class Run {

    public static void main(String[] args) {
        Factory factory;
        // 可通过配置文件实现
        factory = new ConcreteFactory();
        Product product;
        product = factory.factoryMethod();
    }
}
