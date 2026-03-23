package com.github.designpattern.builder.经典;

public class ClassicBuilderTest {

    public static void main(String[] args) {
        // 1. 创建指挥者
        CarDirector director = new CarDirector();

        // 2. 构建标准版汽车
        CarBuilder standardBuilder = new StandardCarBuilder();
        Car standardCar = director.constructCar(standardBuilder);
        System.out.println("标准版汽车：" + standardCar);

        // 3. 构建豪华版汽车
        CarBuilder luxuryBuilder = new LuxuryCarBuilder();
        Car luxuryCar = director.constructCar(luxuryBuilder);
        System.out.println("豪华版汽车：" + luxuryCar);
    }
}
