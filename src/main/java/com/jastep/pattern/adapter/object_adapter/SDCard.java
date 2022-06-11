package com.jastep.pattern.adapter.object_adapter;

/**
 * @Author WanJu
 * @create 2022-06-03
 * @Description: 目标接口
 */
public interface SDCard {

    // SD卡读数据
    void writeSD(String message);

    // SD卡写数据
    String readSD();
}
