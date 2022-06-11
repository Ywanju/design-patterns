package com.jastep.pattern.decorator;

/**
 * @Author WanJu
 * @create 2022-06-11
 * @Description: 炒面类
 */
public class FiredFood extends FastFood{

    public FiredFood(){
        super(15.0,"炒面");
    }

    @Override
    public Double count() {
        return getPrice();
    }
}
