package com.github.designpattern.builder.经典;
// 复杂产品：汽车（包含多个组件）
public class Car {

    // 必选组件
    private String body; // 车身
    private String engine; // 发动机
    // 可选组件
    private String interior; // 内饰
    private String wheel; // 轮毂
    private String sunroof; // 天窗

    // setter（仅建造者可调用）
    public void setBody(String body) { this.body = body; }
    public void setEngine(String engine) { this.engine = engine; }
    public void setInterior(String interior) { this.interior = interior; }
    public void setWheel(String wheel) { this.wheel = wheel; }
    public void setSunroof(String sunroof) { this.sunroof = sunroof; }

    @Override
    public String toString() {
        return "Car{" +
                "body='" + body + '\'' +
                ", engine='" + engine + '\'' +
                ", interior='" + interior + '\'' +
                ", wheel='" + wheel + '\'' +
                ", sunroof='" + sunroof + '\'' +
                '}';
    }
}
