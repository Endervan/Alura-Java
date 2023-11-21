package enumuracoes;

import java.util.Date;

public class Order {
     private Integer id;
     private Date moment;
     private OrderStatusEnum status;

    public Order(Integer id, Date moment, OrderStatusEnum status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusEnum getStatus() {
        return status;
    }

    public void setStatus(OrderStatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
