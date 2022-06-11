package com.jastep.pattern.bridge;

/**
 * @Author WanJu
 * @create 2022-06-11
 * @Description: 扩展抽象化角色
 */
public class Windows extends OperatingSystemVersion{


    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
