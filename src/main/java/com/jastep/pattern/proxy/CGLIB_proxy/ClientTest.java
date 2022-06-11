package com.jastep.pattern.proxy.CGLIB_proxy;

/**
 * @Author WanJu
 * @create 2022-05-28
 * @Description:
 */
public class ClientTest {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        final TrainStation stationProxy = proxyFactory.getTrainStationProxy();
        stationProxy.sell2();
    }
}
