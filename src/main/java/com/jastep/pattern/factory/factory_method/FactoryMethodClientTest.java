package com.jastep.pattern.factory.factory_method;

/**
 * @Author WanJu
 * @create 2022-05-15
 * @Description:
 */
public class FactoryMethodClientTest {
    public static void main(String[] args) {
        final CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setCoffeeFactory(new AmericanCoffeeFactory());
        final Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
