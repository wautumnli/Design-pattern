package com.ql.pattern.factorymethod.demo3;

/**
 * @author wanqiuli
 * @date 2022/4/1 12:59
 */
public class Run {
    public static void main(String[] args) {
        LoggerFactory factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();
    }
}
