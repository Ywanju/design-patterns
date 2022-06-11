package com.jastep.pattern.adapter.object_adapter;

/**
 * @Author WanJu
 * @create 2022-06-03
 * @Description: 适配者接口
 */
public interface TFCard {

    // TF卡读数据
    void writeTF(String message);

    // TF卡写数据
    String readTF();

}
