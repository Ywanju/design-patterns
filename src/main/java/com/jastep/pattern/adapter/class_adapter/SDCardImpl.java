package com.jastep.pattern.adapter.class_adapter;

/**
 * @Author WanJu
 * @create 2022-06-03
 * @Description: 目标类
 */
public class SDCardImpl implements SDCard{
    @Override
    public void writeSD(String message) {
        System.out.println("SD卡写入数据:" +message);
    }

    @Override
    public String readSD() {
        String s = "SD卡读取到数据";
        return s;
    }
}
