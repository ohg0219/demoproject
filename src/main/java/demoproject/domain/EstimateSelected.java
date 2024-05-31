package demoproject.domain;

import demoproject.domain.*;
import demoproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class EstimateSelected extends AbstractEvent {

    private Long id;

    public EstimateSelected(Estimate aggregate) {
        super(aggregate);
    }

    public EstimateSelected() {
        super();
    }
}
//>>> DDD / Domain Event
