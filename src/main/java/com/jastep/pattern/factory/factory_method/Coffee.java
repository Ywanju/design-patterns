package com.jastep.pattern.factory.factory_method;

/**
 * @Author WanJu
 * @create 2022-05-15
 * @Description:
 */
public abstract class Coffee {

    protected abstract String getName();

    protected void addSugar(){
        System.out.println("加糖");
    }

    protected void addMilk(){
        System.out.println("加奶");
    }
}
