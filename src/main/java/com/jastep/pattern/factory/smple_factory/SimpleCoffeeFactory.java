package com.jastep.pattern.factory.smple_factory;

/**
 * @Author WanJu
 * @create 2022-05-15
 * @Description:
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("luckin".equals(type)) {
            coffee = new LuckinCoffee();
        }
        return coffee;
    }
}
