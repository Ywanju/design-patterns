package com.jastep.pattern.adapter.object_adapter;

/**
 * @Author WanJu
 * @create 2022-06-03
 * @Description: 适配器类
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard ;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public void writeSD(String message) {
        System.out.println("Adapter write");
        tfCard.writeTF(message);
    }

    @Override
    public String readSD() {
        System.out.println("Adapter read");
        return tfCard.readTF();
    }
}
