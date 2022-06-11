package com.jastep.pattern.builder.demo1;

/**
 * @Author WanJu
 * @create 2022-05-21
 * @Description:
 */
public class Director {

    private Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
