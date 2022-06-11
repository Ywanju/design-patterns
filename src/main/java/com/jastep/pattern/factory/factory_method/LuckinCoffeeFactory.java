package com.jastep.pattern.factory.factory_method;

/**
 * @Author WanJu
 * @create 2022-05-15
 * @Description:
 */
public class LuckinCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LuckinCoffee();
    }
}
