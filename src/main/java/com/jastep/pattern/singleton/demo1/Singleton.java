package com.jastep.pattern.singleton.demo1;

/**
 * @Author WanJu
 * @create 2022-05-06
 * @Description: 单例，饿汉式--静态成员变量的方式
 */
public class Singleton {
    // 1、私有构造方法
    private Singleton(){}

    // 2、在本类中创建本类对象
    private static Singleton instance = new Singleton();

    //3、 提供获取实例的方法
    public static Singleton getInstance(){
        return instance;
    }

}
