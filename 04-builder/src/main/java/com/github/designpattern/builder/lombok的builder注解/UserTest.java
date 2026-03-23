package com.github.designpattern.builder.lombok的builder注解;

public class UserTest {

    public static void main(String[] args) {
        User user = User.builder()
                .id("1001")
                .name("张三")
                .age(25)
                .phone("13800138000")
                .build();
        System.out.println(user);
    }
}
