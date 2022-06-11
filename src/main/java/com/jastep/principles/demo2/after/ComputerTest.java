package com.jastep.principles.demo2.after;

/**
 * @Author WanJu
 * @create 2022-05-03
 * @Description:
 */
public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu(new IntelCpu());
        computer.setDisk(new XiJieHardDisk());
        computer.setMemory(new KingstonMemory());
        computer.run();
    }
}
