package com.jastep.pattern.factory.smple_factory;

/**
 * @Author WanJu
 * @create 2022-05-15
 * @Description:
 */
public class ClientTest {
    public static void main(String[] args) {
        final Coffee coffee = CoffeeStore.orderCoffee("luckin");
        System.out.println(coffee.getName());
    }
}
