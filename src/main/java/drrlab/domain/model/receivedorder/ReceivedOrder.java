package drrlab.domain.model.receivedorder;

import drrlab.domain.model.item.Item;
import drrlab.domain.type.Amount;
import drrlab.domain.type.DeliveryDate;

/**
 * 受注
 */
public class ReceivedOrder {
    private final ReceivedOrderId id;
    private final Item item;
    private final Amount amount;
    private final DeliveryDate deliveryDate;

    public ReceivedOrder(final Item item, final Amount amount, final DeliveryDate deliveryDate) {
        this.id = new ReceivedOrderId();
        this.item = item;
        this.amount = amount;
        this.deliveryDate = deliveryDate;
    }
}
