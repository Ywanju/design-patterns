package com.jastep.pattern.proxy.JDK_proxy;

/**
 * @Author WanJu
 * @create 2022-05-23
 * @Description:
 */
public class ClientTest {
    public static void main(String[] args) {
        final DynamicProxyFactory fac = new DynamicProxyFactory();
        final SellTickets proxyObject = fac.getProxyObject();
        proxyObject.sell();
    }
}
