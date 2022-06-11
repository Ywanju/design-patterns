package com.jastep.pattern.builder.demo2;

/**
 * @Author WanJu
 * @create 2022-05-21
 * @Description:
 */
public class ClientTest {
    public static void main(String[] args) {
        final Computer computer = new Computer.Builder()
                .cpu("三星")
                .memory("金士顿")
                .style("联想")
                .price(7658.0)
                .builder();
        System.out.println(computer);
    }
}
