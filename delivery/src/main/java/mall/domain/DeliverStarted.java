package mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mall.domain.*;
import mall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliverStarted extends AbstractEvent {

    private Long id;
    private String userId;
    private Long productId;
    private Integer qty;
    private String status;

    public DeliverStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliverStarted() {
        super();
    }
}
//>>> DDD / Domain Event
