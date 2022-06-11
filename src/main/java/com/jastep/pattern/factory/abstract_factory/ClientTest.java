package com.jastep.pattern.factory.abstract_factory;

/**
 * @Author WanJu
 * @create 2022-05-15
 * @Description:
 */
public class ClientTest {
    public static void main(String[] args) {
        final AmericanDessertFactory factory = new AmericanDessertFactory();
        final Coffee coffee = factory.createCoffee();
        final Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
