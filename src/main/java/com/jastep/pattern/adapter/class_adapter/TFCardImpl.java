package com.jastep.pattern.adapter.class_adapter;

/**
 * @Author WanJu
 * @create 2022-06-03
 * @Description: 适配者类
 */
public class TFCardImpl implements TFCard{
    @Override
    public void writeTF(String message) {
        System.out.println("TF卡写数据:" + message);
    }

    @Override
    public String readTF() {
        String s = "TF卡读取到数据";
        return s;
    }
}
