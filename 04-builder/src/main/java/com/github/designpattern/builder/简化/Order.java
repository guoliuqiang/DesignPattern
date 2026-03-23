package com.github.designpattern.builder.简化;

public class Order {

    // 必选属性
    private String orderId;
    private String userId;
    private double amount;
    // 可选属性
    private String address;
    private String paymentType;
    private String remark;

    // 私有构造器（仅Builder可创建）
    private Order(OrderBuilder builder) {
        this.orderId = builder.orderId;
        this.userId = builder.userId;
        this.amount = builder.amount;
        this.address = builder.address;
        this.paymentType = builder.paymentType;
        this.remark = builder.remark;
    }

    // 静态内部建造者（链式调用核心）
    public static class OrderBuilder {
        // 必选属性（构造器强制传入，保证完整性）
        private final String orderId;
        private final String userId;
        private final double amount;
        // 可选属性（默认值）
        private String address = "默认地址";
        private String paymentType = "支付宝";
        private String remark = "无备注";

        // 构造器：强制传入必选属性
        public OrderBuilder(String orderId, String userId, double amount) {
            this.orderId = orderId;
            this.userId = userId;
            this.amount = amount;
        }

        // 链式方法：设置可选属性
        public OrderBuilder address(String address) {
            this.address = address;
            return this; // 返回this，实现链式调用
        }

        public OrderBuilder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public OrderBuilder remark(String remark) {
            this.remark = remark;
            return this;
        }

        // 构建方法：返回最终产品
        public Order build() {
            // 可选：校验必选属性（保证对象完整性）
            if (orderId == null || userId == null) {
                throw new IllegalArgumentException("订单ID和用户ID不能为空");
            }
            return new Order(this);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", userId='" + userId + '\'' +
                ", amount=" + amount +
                ", address='" + address + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
