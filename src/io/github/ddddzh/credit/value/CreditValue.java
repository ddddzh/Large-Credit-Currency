package io.github.ddddzh.credit.value;

import lombok.AllArgsConstructor;

/**
 * Value part of a credit currency instance.
 * range from 1 ~ 999. Integers only.
 */
@AllArgsConstructor
public class CreditValue {
    private int value;
}
