package com.jastep.pattern.adapter.class_adapter;

/**
 * @Author WanJu
 * @create 2022-06-03
 * @Description: 计算机类
 */
public class Computer {
    // 从SD卡读取数据
    public String readSD(SDCard sdCard){
        if (null==sdCard){
            System.out.println("SDCard is null !");
        }
        return sdCard.readSD();
    }
}
