package io.github.ddddzh.credit.unit;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CreditUnitType {
    /**
     * Organic credit unit bit.
     * None, K, M, B, T.
     */
    Organic(1, 5),
    /**
     * Artificial credit unit bits,
     */
    Artificial(0, 26);

    private int priority;
    private int size;
}
