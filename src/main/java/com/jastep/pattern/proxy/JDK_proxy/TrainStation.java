package com.jastep.pattern.proxy.JDK_proxy;

/**
 * @Author WanJu
 * @create 2022-05-23
 * @Description:
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
