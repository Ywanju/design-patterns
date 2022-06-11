package com.jastep.pattern.builder.demo1;

/**
 * @Author WanJu
 * @create 2022-05-21
 * @Description:
 */
public class MobileBike extends Builder{
    @Override
    public void buildFrame() {
        this.mBike.setFrame("碳纤维");
    }

    @Override
    public void buildSeat() {
        this.mBike.setSeat("真皮");
    }

    @Override
    public Bike createBike() {
        return this.mBike;
    }
}
