package com.jastep.pattern.singleton.demo5;

/**
 * @Author WanJu
 * @create 2022-05-07
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        final Singleton instance = Singleton.getInstance();
        final Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1==instance);
    }
}
