package enumuracoes;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Order order = new Order(1000, new Date(), OrderStatusEnum.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatusEnum os1 = OrderStatusEnum.DELIVERED;
        // pegando valor em string e transformndo em um enum
        OrderStatusEnum os2 = OrderStatusEnum.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
