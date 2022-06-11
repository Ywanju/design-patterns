package com.jastep.pattern.singleton.demo7;

import java.lang.reflect.Constructor;

/**
 * @Author WanJu
 * @create 2022-05-07
 * @Description: 演示通过反射的方式破坏单例模式
 */
public class Test2 {
    public static void main(String[] args) throws Exception{
        // 获取字节码对象
        final Class aClass = Singleton.class;
        // 获取无参构造方法对象
        final Constructor constructors = aClass.getDeclaredConstructor();
        // 取消访问检查
        constructors.setAccessible(true);
        // 创建Singleton对象
        final Singleton instance = (Singleton) constructors.newInstance();
        final Singleton instance1 = (Singleton) constructors.newInstance();
        System.out.println(instance==instance1);
    }
}
