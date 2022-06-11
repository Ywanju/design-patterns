package com.jastep.pattern.builder.demo1;

/**
 * @Author WanJu
 * @create 2022-05-21
 * @Description:
 */
public abstract class Builder {
    protected Bike mBike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();

}
