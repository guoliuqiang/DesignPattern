package com.github.designpattern.builder.经典;

// 具体建造者2：豪华版汽车
public class LuxuryCarBuilder extends CarBuilder {

    @Override
    public void buildBody() {
        car.setBody("豪华版车身（铝合金）");
    }

    @Override
    public void buildEngine() {
        car.setEngine("2.0T 涡轮增压发动机");
    }

    @Override
    public void buildInterior() {
        car.setInterior("豪华版内饰（真皮座椅）");
    }

    @Override
    public void buildWheel() {
        car.setWheel("18寸运动轮毂");
    }

    @Override
    public void buildSunroof() {
        car.setSunroof("全景天窗");
    }
}
