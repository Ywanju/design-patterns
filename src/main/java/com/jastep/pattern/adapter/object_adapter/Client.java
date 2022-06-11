package com.jastep.pattern.adapter.object_adapter;

/**
 * @Author WanJu
 * @create 2022-06-03
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // 读取SD卡的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        System.out.println("=============================");
        String sd = computer.readSD(new SDAdapterTF(new TFCardImpl()));
        System.out.println(sd);
    }
}
