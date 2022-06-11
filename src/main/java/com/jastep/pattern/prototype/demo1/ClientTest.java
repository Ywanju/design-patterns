package com.jastep.pattern.prototype.demo1;

/**
 * @Author WanJu
 * @create 2022-05-21
 * @Description:
 */
public class ClientTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        final Realizetype realizetype = new Realizetype();
        System.out.println("===============");
        final Realizetype clone = realizetype.clone();
        System.out.println("==================");
        System.out.println(realizetype ==clone);
    }
}
