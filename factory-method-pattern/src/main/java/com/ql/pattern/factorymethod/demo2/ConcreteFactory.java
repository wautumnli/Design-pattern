package com.ql.pattern.factorymethod.demo2;

class ConcreteFactory implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}