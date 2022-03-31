package com.ql.pattern.simplefactory.demo2;

class Client {
    public static void main(String[] args) {
        Chart chart;
        //通过静态工厂方法创建产品
        chart = ChartFactory.getChart("pie");
        chart.display();
    }
}