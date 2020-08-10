package cn.lhzh.springboot04webrestfulcrud.listener;

import ch.qos.logback.core.net.SyslogOutputStream;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("context 启动了。。。。");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context 销毁了");
    }
}
