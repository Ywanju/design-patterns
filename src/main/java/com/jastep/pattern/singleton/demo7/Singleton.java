package com.jastep.pattern.singleton.demo7;


import java.io.Serializable;

/**
 * @Author WanJu
 * @create 2022-05-07
 * @Description: 单例 -- 懒汉式  -静态内部类方式
 */
public class Singleton implements Serializable {

    private Singleton(){}

    // 定义一个静态内部类，静态内部类在内部类被调用时进行初始化加载
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton  getInstance(){
        return SingletonHolder.INSTANCE;
    }

    // 当进行反序列化时会自动调用该方法，将方法的返回值直接返回 返回值类型必须是 Object才可以
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }

}
