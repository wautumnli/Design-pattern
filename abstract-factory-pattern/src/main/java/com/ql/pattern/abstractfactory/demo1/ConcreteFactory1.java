package com.ql.pattern.abstractfactory.demo1;

/**
 * @author wanqiuli
 * @date 2022/4/6 9:29 下午
 */
public class ConcreteFactory1 extends AbstractFactory {
    /**
     * 工厂方法一
     *
     * @return the {@link AbstractProductA} data
     */
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    /**
     * 工厂方法二
     *
     * @return the {@link AbstractProductB} data
     */
    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}