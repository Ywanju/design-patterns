package com.jastep.pattern.bridge;

/**
 * @Author WanJu
 * @create 2022-06-11
 * @Description:
 */
public class client {
    public static void main(String[] args) {
        final Windows windows = new Windows(new AviFile());
        windows.play("文件1");
    }
}
