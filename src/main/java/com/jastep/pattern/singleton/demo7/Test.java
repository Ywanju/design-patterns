package com.jastep.pattern.singleton.demo7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author WanJu
 * @create 2022-05-07
 * @Description: 通过序列化和反序列化演示破坏单例模式的效果
 */
public class Test {
    public static void main(String[] args) throws Exception{
//        writeObjectToFile();
        final Singleton objectFromFile = getObjectFromFile();
        final Singleton objectFromFile1 = getObjectFromFile();
        System.out.println(objectFromFile1);
        System.out.println(objectFromFile);
        System.out.println(objectFromFile==objectFromFile1);
    }

    // 读文件
    public static Singleton getObjectFromFile()throws Exception{
        final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("F:\\a.txt"));
        final Singleton singleton = (Singleton) objectInputStream.readObject();
        return singleton;
    }

    // 写文件
    public static void writeObjectToFile() throws Exception{
        final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("F:\\a.txt"));
        objectOutputStream.writeObject(Singleton.getInstance());
        objectOutputStream.close();
    }
}
