package com.ql.pattern.simplefactory.demo1;

class Client {
    public static void main(String[] args) {
        Product product;
        //通过工厂类创建产品对象
        product = Factory.getProduct("A");
        product.methodSame();
        product.methodDiff();
    }
}