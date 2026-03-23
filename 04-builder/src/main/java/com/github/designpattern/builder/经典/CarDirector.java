package com.github.designpattern.builder.经典;

// 指挥者：控制构建流程（固定步骤，无需关注细节）
public class CarDirector {

    // 构建汽车的通用流程
    public Car constructCar(CarBuilder builder) {
        // 必选步骤（固定顺序）
        builder.buildBody();
        builder.buildEngine();
        builder.buildInterior();
        builder.buildWheel();
        // 可选步骤（按需执行）
        if (builder instanceof LuxuryCarBuilder) {
            builder.buildSunroof();
        }
        return builder.getCar();
    }
}
