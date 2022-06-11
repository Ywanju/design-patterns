package com.jastep.pattern.builder.demo1;

/**
 * @Author WanJu
 * @create 2022-05-21
 * @Description:
 */
public class OfoBike extends Builder{
    @Override
    public void buildFrame() {
        this.mBike.setFrame("铝合金");
    }

    @Override
    public void buildSeat() {
        this.mBike.setSeat("塑料");
    }

    @Override
    public Bike createBike() {
        return this.mBike;
    }
}
