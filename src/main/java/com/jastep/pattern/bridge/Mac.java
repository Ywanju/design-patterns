package com.jastep.pattern.bridge;

/**
 * @Author WanJu
 * @create 2022-06-11
 * @Description:
 */
public class Mac extends OperatingSystemVersion{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
