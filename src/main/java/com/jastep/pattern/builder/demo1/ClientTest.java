package com.jastep.pattern.builder.demo1;

/**
 * @Author WanJu
 * @create 2022-05-21
 * @Description:
 */
public class ClientTest {
    public static void main(String[] args) {
        final Director director = new Director(new OfoBike());
        final Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
