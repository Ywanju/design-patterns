package com.jastep.pattern.singleton.demo4;

/**
 * @Author WanJu
 * @create 2022-05-07
 * @Description: 单例--懒汉式 -- 双重检查锁方式
 */
public class Singleton {
    // 私有构造
    private Singleton(){}

    //私有属性
    private static volatile Singleton instance;

    //对外提供方法
    // 在多线程的情况下可能会出现空指针，出现空指针的原因是JVM在实例化对象的时候会进行优化和指令重排序操作,所以在属性上加
    // volatile 关键字保证可见性与有序性
    public static Singleton getInstance(){
        if (null==instance){
            synchronized (Singleton.class){
                if (null==instance){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
