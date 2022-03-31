package com.ql.pattern.simplefactory.demo1;

class Factory {
    /**
     * 静态工厂方法
     *
     * @param arg the arg
     * @return the {@link Product} data
     */
    public static Product getProduct(String arg) {
        Product product = null;
        if ("A".equalsIgnoreCase(arg)) {
            product = new ConcreteProductA();
            //初始化设置product  
        } else if ("B".equalsIgnoreCase(arg)) {
            product = new ConcreteProductB();
            //初始化设置product  
        }
        return product;
    }
}