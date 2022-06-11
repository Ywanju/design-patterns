package com.jastep.pattern.factory.factory_method;


/**
 * @Author WanJu
 * @create 2022-05-15
 * @Description:
 */
public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(){
        final Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
