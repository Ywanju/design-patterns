package com.jastep.pattern.prototype.demo2;

/**
 * @Author WanJu
 * @create 2022-05-21
 * @Description:
 */
public class Citation implements Cloneable{

    // 原型对象的属性
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    //    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Citation(){
        System.out.println("使用无参构造创建对象");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show(){
        System.out.println("恭贺"+user.getName()+",喜提大奖!");
    }
}
