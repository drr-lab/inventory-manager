package drrlab.domain.type;

/**
 * 数量
 */
public class Amount {
    private final int value;

    public Amount(final int value) {
        if (!isValid(value)) throw new IllegalArgumentException();
        this.value = value;
    }

    private static boolean isValid(final int value) {
        return value >= 0;
    }

    public Amount add(final Amount o) {
        return new Amount(this.value + o.value);
    }

    public Amount difference(final Amount o) {
        return new Amount(Math.abs(this.value - o.value));
    }

    public Amount multiple(final Amount o) {
        return new Amount(this.value * o.value);
    }

    public boolean eq(final Amount o) {
        return this.value == o.value;
    }

    public boolean gt(final Amount o) {
        return this.value > o.value;
    }

    public boolean lt(final Amount o) {
        return this.value < o.value;
    }

    public boolean ge(final Amount o) {
        return this.value >= o.value;
    }

    public boolean le(final Amount o) {
        return this.value <= o.value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Amount amount = (Amount) o;

        return value == amount.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
