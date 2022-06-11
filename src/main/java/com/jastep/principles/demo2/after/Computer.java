package com.jastep.principles.demo2.after;

/**
 * @Author WanJu
 * @create 2022-05-03
 * @Description: 依赖倒转原则
 */
public class Computer {
    private Cpu cpu;
    private Disk disk;
    private Memory memory;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run(){
        System.out.println("计算机工作");
        cpu.run();
        memory.save();
        String data = disk.get();
        System.out.println("从硬盘中获取的数据为：" + data);
    }
}
