package com.jastep.pattern.prototype.demo2;

/**
 * @Author WanJu
 * @create 2022-05-21
 * @Description:
 */
public class ClientTest {
    public static void main(String[] args) throws Exception{
        // 先创建一个原型对象
        final Citation citation = new Citation();
        User user = new User();
        user.setName("张三");
        citation.setUser(user);
        // 用原型对象克隆新对象(浅克隆)
        final Citation c1  = citation.clone();
        c1.getUser().setName("李四");
//        final Citation c2  = citation.clone();

        // 为克隆出来的对象设置属性值
//        c1.setName("张三");
//        c2.setName("李四");

        citation.show();
        c1.show();

    }
}
