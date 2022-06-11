package com.jastep.principles.demo1;

/**
 * @Author WanJu
 * @create 2022-05-03
 * @Description:
 */
public class CoffeeTest {

    public static void main(String[] args) {
        final Coffee coffee = new Coffee();
//        final LuckinCoffee luckinCoffee = new LuckinCoffee();
//        coffee.setAbstractCoffee(luckinCoffee);
        final StarBucksCoffee starBucksCoffee = new StarBucksCoffee();
        coffee.setAbstractCoffee(starBucksCoffee);
        coffee.coffee();
    }
}
