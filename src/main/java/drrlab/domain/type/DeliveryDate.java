package drrlab.domain.type;

import java.time.LocalDate;

/**
 * 納期
 */
public class DeliveryDate {
    private final LocalDate value;

    public DeliveryDate(final LocalDate value) {
        this.value = value;
    }

    public boolean isAfter(final DeliveryDate o) {
        return this.value.isAfter(o.value);
    }

    public boolean isBefore(final DeliveryDate o) {
        return this.value.isBefore(o.value);
    }

    public boolean isEqual(final DeliveryDate o) {
        return this.value.isEqual(o.value);
    }
}
