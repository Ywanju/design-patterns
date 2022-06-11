package com.jastep.pattern.prototype.demo1;

/**
 * @Author WanJu
 * @create 2022-05-21
 * @Description:
 */
public class Realizetype implements Cloneable{

    public Realizetype(){
        System.out.println("无参构造创建对象!");
    }


    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        return (Realizetype) super.clone();
    }
}
