package com.jastep.principles.demo2.before;

/**
 * @Author WanJu
 * @create 2022-05-03
 * @Description:
 */
public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setHardDisk(new XiJieHardDisk());
        computer.setCpu(new IntelCpu());
        computer.setMemory(new KingstonMemory());

        computer.run();
    }
}
