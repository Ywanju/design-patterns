package com.jastep.principles.demo2.before;

/**
 * @Author WanJu
 * @create 2022-05-03
 * @Description: 希捷硬盘类
 */
public class XiJieHardDisk {

    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据" + data);
    }

    public String get() {
        System.out.println("使用希捷希捷硬盘取数据");
        return "数据";
    }
}
