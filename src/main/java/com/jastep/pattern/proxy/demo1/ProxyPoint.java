package com.jastep.pattern.proxy.demo1;

/**
 * @Author WanJu
 * @create 2022-05-23
 * @Description:
 */
public class ProxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.err.println("代理对象处理... ...");
        trainStation.sell();
    }
}
