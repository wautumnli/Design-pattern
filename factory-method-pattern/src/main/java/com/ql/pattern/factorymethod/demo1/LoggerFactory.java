package com.ql.pattern.factorymethod.demo1;

/**
 * 日志记录器工厂
 *
 * @author wanqiuli
 */
public class LoggerFactory {
    /**
     * 静态工厂方法
     *
     * @param args the args
     * @return the {@link Logger} data
     */
    public static Logger createLogger(String args) {
        if (args.equalsIgnoreCase("db")) {
            //连接数据库，代码省略  
            //创建数据库日志记录器对象  
            Logger logger = new DatabaseLogger();
            //初始化数据库日志记录器，代码省略  
            return logger;
        } else if (args.equalsIgnoreCase("file")) {
            //创建日志文件  
            //创建文件日志记录器对象  
            Logger logger = new FileLogger();
            //初始化文件日志记录器，代码省略  
            return logger;
        } else {
            return null;
        }
    }
}