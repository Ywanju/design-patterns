package com.jastep.principles.demo3;

/**
 * @Author WanJu
 * @create 2022-05-03
 * @Description:
 */
public class ItcastSafetyDoor implements AntiTheft,Fireproof{

    public void antiTheft() {
        System.out.println("防盗");
    }


    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
