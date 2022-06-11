package com.jastep.pattern.prototype.demo3;

import java.io.Serializable;

/**
 * @Author WanJu
 * @create 2022-05-21
 * @Description:
 */
public class User implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
