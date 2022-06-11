package com.jastep.pattern.singleton.demo3;

/**
 * @Author WanJu
 * @create 2022-05-07
 * @Description: 单例--懒汉式--线程安全加 synchronized 关键字解决
 */
public class Singleton {

    // 私有构造方法
    private Singleton(){}

    // 私有属性
    private static Singleton instance;

    // 对外的方法
    public static synchronized Singleton getInstance()  {
        // synchronized保证多线程情况下数据安全的问题

        if (null==instance){
            instance = new Singleton();
        }
        return instance;
    }


}
