package com.jastep.pattern.decorator;


/**
 * @Author WanJu
 * @create 2022-06-11
 * @Description: 抽象快餐类
 */
public abstract class FastFood {

    private Double price;

    private String desc;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood() {
    }

    public FastFood(Double price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    /**
     * 抽象方法，子类具体实现
     * @return
     */
    public abstract Double count();
}
