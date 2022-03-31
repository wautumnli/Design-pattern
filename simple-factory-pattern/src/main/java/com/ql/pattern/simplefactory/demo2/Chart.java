package com.ql.pattern.simplefactory.demo2;

/**
 * 抽象图表接口：抽象产品类
 */
interface Chart {
    /**
     * function is display
     */
    public void display();
}

/**
 * 柱状图类：具体产品类
 */
class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图！");
    }
}

/**
 * 饼状图类：具体产品类
 */
class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼状图！");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图！");
    }
}

/**
 * 折线图类：具体产品类
 */
class LineChart implements Chart {
    public LineChart() {
        System.out.println("创建折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }
}

/**
 * 图表工厂类：工厂类
 */
class ChartFactory {
    /**
     * 静态工厂方法
     *
     * @param type the type
     * @return the {@link Chart} data
     */
    public static Chart getChart(String type) {
        Chart chart = null;
        if ("histogram".equalsIgnoreCase(type)) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        } else if ("pie".equalsIgnoreCase(type)) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图！");
        } else if ("line".equalsIgnoreCase(type)) {
            chart = new LineChart();
            System.out.println("初始化设置折线图！");
        }
        return chart;
    }
}