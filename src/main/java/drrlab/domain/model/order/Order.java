package drrlab.domain.model.order;

import drrlab.domain.model.item.Item;
import drrlab.domain.type.Amount;
import drrlab.domain.type.DeliveryDate;

/**
 * 発注
 */
public class Order {
    private final OrderId id;
    private final Item item;
    private final Amount amount;
    private final DeliveryDate deliveryDate;

    public Order(final Item item, final Amount amount, final DeliveryDate deliveryDate) {
        this.id = new OrderId();
        this.item = item;
        this.amount = amount;
        this.deliveryDate = deliveryDate;
    }
}
