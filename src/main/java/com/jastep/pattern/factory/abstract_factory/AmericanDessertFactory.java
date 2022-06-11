package com.jastep.pattern.factory.abstract_factory;

/**
 * @Author WanJu
 * @create 2022-05-15
 * @Description: 美式风味甜品工厂
 */
public class AmericanDessertFactory implements AbstractFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
