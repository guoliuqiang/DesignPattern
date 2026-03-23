package com.github.designpattern.prototype;

public class RealizeType implements Cloneable{

    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        RealizeType clone = (RealizeType) realizeType.clone();
        System.out.println(clone);
    }
}
