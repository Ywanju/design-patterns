package com.jastep.pattern.decorator;

/**
 * @Author WanJu
 * @create 2022-06-11
 * @Description:
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(fastFood, 2.0, "培根");
    }

    @Override
    public Double count() {
        return getPrice() + getFastFood().count();
    }

    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }

}
