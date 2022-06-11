package com.jastep.pattern.decorator;

/**
 * @Author WanJu
 * @create 2022-06-11
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        FastFood food = new FiredFood();
        System.out.println(food.getDesc()+food.count()+"元");
        System.out.println("===========================");
        food = new Egg(food);
        System.out.println(food.getDesc()+food.count()+"元");
        System.out.println("===========================");
        food = new Bacon(food);
        System.out.println(food.getDesc()+food.count()+"元");
    }
}
