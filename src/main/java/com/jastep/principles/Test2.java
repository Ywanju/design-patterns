package com.jastep.principles;

/**
 * @Author WanJu
 * @create 2022-05-04
 * @Description:
 */
public class Test2 {
    public static void main(String[] args) {
        new Test2().outPrint(3);
    }
    private int age = 12;
    public void outPrint(int x){
        class InClass{
            public void InPrint(){
                System.out.println(x);
                System.out.println(age);
            }
        }
        new InClass().InPrint();
    }
}
