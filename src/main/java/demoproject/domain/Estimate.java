package demoproject.domain;

import demoproject.OrdersApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Estimate_table")
@Data
//<<< DDD / Aggregate Root
public class Estimate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String branchCd;

    private Integer amnt;

    private Double rate;

    private Integer exchangeAmnt;

    public static EstimateRepository repository() {
        EstimateRepository estimateRepository = OrdersApplication.applicationContext.getBean(
            EstimateRepository.class
        );
        return estimateRepository;
    }
}
//>>> DDD / Aggregate Root
