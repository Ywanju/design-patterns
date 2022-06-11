package com.jastep.pattern.proxy.demo1;

/**
 * @Author WanJu
 * @create 2022-05-23
 * @Description:
 */
public class ClientTest {
    public static void main(String[] args) {
        final ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
