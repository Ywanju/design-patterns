package com.jastep.pattern.bridge;

/**
 * @Author WanJu
 * @create 2022-06-11
 * @Description:
 */
public class RevbbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("REVBB文件格式："+fileName);
    }
}
