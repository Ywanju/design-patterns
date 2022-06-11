package com.jastep.principles.demo3;

/**
 * @Author WanJu
 * @create 2022-05-03
 * @Description:
 */
public class HeiMaSafetyDoor implements AntiTheft,Fireproof,Waterproof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
