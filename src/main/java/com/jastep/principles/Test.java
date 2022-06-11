package com.jastep.principles;

/**
 * @Author WanJu
 * @create 2022-05-04
 * @Description:
 */
public class Test {

    public void test(int b){
        int a = 10;
        new Thread(){
          public void run(){
              System.out.println(a);
              System.out.println(b);
          }
        }.start();
    }
}
