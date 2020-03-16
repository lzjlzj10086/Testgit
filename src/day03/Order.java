package day03;

/**
 * 订单类
 * liangzijie
 * @2020.3.4
 */
public class Order {
    //订单创建时间
    private String orderCreateTime;
    //订单创建者
    private String orderCreatePerson;
    //订单取消时间
    private String orderCancelsTime;
    //订单编号
    private String orderCode;
    //订单商品编号
    private String orderProductCode;

    public String getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderCreatePerson() {
        return orderCreatePerson;
    }

    public void setOrderCreatePerson(String orderCreatePerson) {
        this.orderCreatePerson = orderCreatePerson;
    }

    public String getOrderCancelsTime() {
        return orderCancelsTime;
    }

    public void setOrderCancelsTime(String orderCancelsTime) {
        this.orderCancelsTime = orderCancelsTime;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderProductCode() {
        return orderProductCode;
    }

    public void setOrderProductCode(String orderProductCode) {
        this.orderProductCode = orderProductCode;
    }
}
