package com.jastep.pattern.bridge;

/**
 * @Author WanJu
 * @create 2022-06-11
 * @Description: 抽象化角色
 */
public abstract class OperatingSystemVersion {

    protected VideoFile videoFile;

    public OperatingSystemVersion(VideoFile videoFile){
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);

}
