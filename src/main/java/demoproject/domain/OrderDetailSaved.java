package demoproject.domain;

import demoproject.domain.*;
import demoproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderDetailSaved extends AbstractEvent {

    private Long id;
    private String currencyCd;
    private Integer amnt;

    public OrderDetailSaved(Order aggregate) {
        super(aggregate);
    }

    public OrderDetailSaved() {
        super();
    }
}
//>>> DDD / Domain Event
