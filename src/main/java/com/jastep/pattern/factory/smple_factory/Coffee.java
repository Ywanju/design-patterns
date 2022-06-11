package com.jastep.pattern.factory.smple_factory;

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
