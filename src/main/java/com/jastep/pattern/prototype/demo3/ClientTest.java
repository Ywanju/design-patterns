package com.jastep.pattern.prototype.demo3;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author WanJu
 * @create 2022-05-21
 * @Description: 使用对象流实现深克隆
 */
public class ClientTest {
    public static void main(String[] args) throws Exception{
        // 先创建一个原型对象
        final Citation citation = new Citation();
        User user = new User();
        user.setName("张三");
        citation.setUser(user);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f:/a.txt"));
        oos.writeObject(citation);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f:/a.txt"));
        Citation c1 = (Citation) ois.readObject();
        c1.getUser().setName("李四");
        ois.close();

        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("f:/a.txt"));
        Citation c2 = (Citation) ois1.readObject();
        c2.getUser().setName("王五");
        ois1.close();

        citation.show();
        c1.show();
        c2.show();
    }
}
