package com.github.designpattern.builder.经典;

// 抽象建造者：定义构建汽车的步骤
public abstract  class CarBuilder {

    // 持有产品实例
    protected Car car = new Car();

    // 必选步骤
    public abstract void buildBody();
    public abstract void buildEngine();
    // 可选步骤
    public abstract void buildInterior();
    public abstract void buildWheel();
    // 扩展步骤（可选）
    public void buildSunroof() {} // 空实现，子类按需重写

    // 返回构建好的产品
    public Car getCar() {
        return car;
    }
}
