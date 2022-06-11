package com.jastep.pattern.singleton.demo2;

/**
 * @Author WanJu
 * @create 2022-05-06
 * @Description: 单例--静态代码块
 */
public class Singleton {

    // 1、私有构造
    private Singleton(){}

    // 2、静态变量
    private static Singleton instance;

    // 3、静态代码块
    static {
        instance = new Singleton();
    }

    // 4、对外提供方法
    public static Singleton getInstance(){
        return instance;
    }
}
