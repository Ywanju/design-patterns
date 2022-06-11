package com.jastep.pattern.decorator;

/**
 * @Author WanJu
 * @create 2022-06-11
 * @Description: 配料类，装饰者类
 */
public abstract class Garnish extends FastFood{

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood,Double price,String desc){
        super(price,desc);
        this.fastFood = fastFood;
    }

}
