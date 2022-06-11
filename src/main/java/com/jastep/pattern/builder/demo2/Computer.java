package com.jastep.pattern.builder.demo2;

/**
 * @Author WanJu
 * @create 2022-05-21
 * @Description: 构建者模式2
 */
public class Computer {

    private String style;
    private String cpu;
    private String memory;
    private Double price;

    @Override
    public String toString() {
        return "Computer{" +
                "style='" + style + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", price=" + price +
                '}';
    }

    private Computer (Builder builder){
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.style = builder.style;
        this.price = builder.price;
    }

    public static final class Builder{
        private String style;
        private String cpu;
        private String memory;
        private Double price;

        public Builder(){}

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }
        public Builder style(String style){
            this.style = style;
            return this;
        }
        public Builder price(Double price){
            this.price = price;
            return this;
        }

        public Computer builder(){
            return new Computer(this);
        }
    }
}
