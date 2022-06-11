package com.jastep.pattern.decorator;

/**
 * @Author WanJu
 * @create 2022-06-11
 * @Description: 炒饭类
 */
public class FiredRice extends FastFood{
    public FiredRice(){
        super(20.0,"炒饭");
    }

    @Override
    public Double count() {
        return getPrice();
    }
}
