package com.ql.pattern.simplefactory;


/**
 * 这时候如果要新加类型，需要修改类本身，违反了开闭原则
 * 对象的创建和使用没有分离。
 * 客户端只是使用这个对象的某个功能，但是还需要先去构造这个对象，耦合度高
 *
 * @author wanqiuli
 */
public class Chart {
    /**
     * 图标类型
     */
    private String type;

    public Chart(Object[][] data, String type) {
        this.type = type;
        if ("histogram".equalsIgnoreCase(type)) {
            //初始化柱状图  
        } else if ("pie".equalsIgnoreCase(type)) {
            //初始化饼状图  
        } else if ("line".equalsIgnoreCase(type)) {
            //初始化折线图  
        }
    }

    public void display() {
        if ("histogram".equalsIgnoreCase(this.type)) {
            //显示柱状图  
        } else if ("pie".equalsIgnoreCase(this.type)) {
            //显示饼状图  
        } else if ("line".equalsIgnoreCase(this.type)) {
            //显示折线图  
        }
    }
}