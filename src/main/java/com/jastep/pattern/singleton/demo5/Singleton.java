package com.jastep.pattern.singleton.demo5;


/**
 * @Author WanJu
 * @create 2022-05-07
 * @Description: 单例 -- 懒汉式  -静态内部类方式
 */
public class Singleton {

    private Singleton(){}

    // 定义一个静态内部类，静态内部类在内部类被调用时进行初始化加载
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton  getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
