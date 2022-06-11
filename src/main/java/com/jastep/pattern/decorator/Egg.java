package com.jastep.pattern.decorator;

/**
 * @Author WanJu
 * @create 2022-06-11
 * @Description: 鸡蛋配料
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(fastFood, 1.0, "鸡蛋");
    }

    @Override
    public Double count() {
        return getPrice() + getFastFood().count();
    }

    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }

}
