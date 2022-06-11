package com.jastep.pattern.factory.abstract_factory;

/**
 * @Author WanJu
 * @create 2022-05-15
 * @Description: 意大利风味甜品工厂
 */
public class ItalyDessertFactory implements AbstractFactory{
    @Override
    public Coffee createCoffee() {
        return new LuckinCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
