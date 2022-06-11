package com.jastep.pattern.factory.smple_factory;

/**
 * @Author WanJu
 * @create 2022-05-15
 * @Description:
 */
public class CoffeeStore {

    public static Coffee orderCoffee(String type){
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        final Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
