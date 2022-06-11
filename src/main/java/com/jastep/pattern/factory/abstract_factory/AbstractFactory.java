package com.jastep.pattern.factory.abstract_factory;

/**
 * @Author WanJu
 * @create 2022-05-15
 * @Description: 抽象工厂
 */
public interface AbstractFactory {
    /**
     * 生产咖啡的工厂
     */
    Coffee createCoffee();

    /**
     * 生产甜品的工厂
     */
    Dessert createDessert();

}
