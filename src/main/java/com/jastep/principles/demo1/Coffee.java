package com.jastep.principles.demo1;

/**
 * @Author WanJu
 * @create 2022-05-03
 * @Description:
 */
public class Coffee {

    private AbstractCoffee abstractCoffee;

    public void setAbstractCoffee(AbstractCoffee abstractCoffee) {
        this.abstractCoffee = abstractCoffee;
    }

    public void coffee(){
       abstractCoffee.coffee();
    }
}
