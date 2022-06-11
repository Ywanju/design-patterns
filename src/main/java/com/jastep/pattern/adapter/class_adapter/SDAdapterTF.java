package com.jastep.pattern.adapter.class_adapter;

/**
 * @Author WanJu
 * @create 2022-06-03
 * @Description: 适配器类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public void writeSD(String message) {
        System.out.println("Adapter write");
        super.writeTF(message);
    }

    @Override
    public String readSD() {
        System.out.println("Adapter read");
        return super.readTF();
    }
}
