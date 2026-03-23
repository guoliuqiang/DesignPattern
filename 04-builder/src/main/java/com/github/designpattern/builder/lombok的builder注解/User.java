package com.github.designpattern.builder.lombok的builder注解;

import lombok.Builder;
import lombok.ToString;

@Builder // 自动生成链式Builder
@ToString
public class User {

    // 必选属性（可通过@NonNull强制非空）
    private final String id;
    private final String name;
    // 可选属性
    private Integer age;
    private String phone;
    private String email;
}
