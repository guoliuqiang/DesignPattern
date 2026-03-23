package com.github.designpattern.builder.经典;


// 具体建造者1：标准版汽车
public class StandardCarBuilder extends CarBuilder {
    @Override
    public void buildBody() {
        car.setBody("标准版车身（钢制）");
    }

    @Override
    public void buildEngine() {
        car.setEngine("1.5L 自然吸气发动机");
    }

    @Override
    public void buildInterior() {
        car.setInterior("标准版内饰（织物座椅）");
    }

    @Override
    public void buildWheel() {
        car.setWheel("16寸普通轮毂");
    }
    // 标准版无天窗，无需重写buildSunroof
}
