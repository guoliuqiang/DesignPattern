package com.github.designpattern.builder.简化;

public class ChainBuilderTest {

    public static void main(String[] args) {
        // 构建订单：必选属性+部分可选属性
        Order order = new Order.OrderBuilder("ORDER_123", "USER_456", 999.99)
                .address("北京市海淀区")
                .paymentType("微信支付")
                .remark("优先发货")
                .build();

        System.out.println("订单信息：" + order);
    }
}
