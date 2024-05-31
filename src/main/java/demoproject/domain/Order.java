package demoproject.domain;

import demoproject.OrdersApplication;
import demoproject.domain.OrderDetailSaved;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Order_table")
@Data
//<<< DDD / Aggregate Root
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String currencyCd;

    private Integer amnt;

    @PostPersist
    public void onPostPersist() {
        OrderDetailSaved orderDetailSaved = new OrderDetailSaved(this);
        orderDetailSaved.publishAfterCommit();
    }

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrdersApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
//>>> DDD / Aggregate Root
