package io.github.ddddzh.credit;

import lombok.AllArgsConstructor;
import lombok.Getter;

import io.github.ddddzh.credit.unit.CreditUnit;
import io.github.ddddzh.credit.value.CreditValue;

/**
 *
 */
@Getter
@AllArgsConstructor
public class CreditStep {
    private CreditValue value;
    private CreditUnit unit;
}
