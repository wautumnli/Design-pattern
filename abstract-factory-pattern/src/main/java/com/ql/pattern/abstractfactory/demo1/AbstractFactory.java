package com.ql.pattern.abstractfactory.demo1;

/**
 * @author wanqiuli
 * @date 2022/4/6 9:28 下午
 */
public abstract class AbstractFactory {
    /**
     * 工厂方法一
     *
     * @return the {@link AbstractProductA} data
     */
    public abstract AbstractProductA createProductA();

    /**
     * 工厂方法二
     *
     * @return the {@link AbstractProductB} data
     */
    public abstract AbstractProductB createProductB();
}
