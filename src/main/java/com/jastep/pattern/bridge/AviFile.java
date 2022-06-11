package com.jastep.pattern.bridge;

/**
 * @Author WanJu
 * @create 2022-06-11
 * @Description: aVIfile具体实现化类
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("AVI文件格式："+fileName);
    }
}
