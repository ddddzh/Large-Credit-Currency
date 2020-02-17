package io.github.ddddzh.credit.unit;

import lombok.AllArgsConstructor;
import lombok.Getter;

import io.github.ddddzh.credit.unit.utils.CreditUnitCalculator;

/**
 * .
 */
@Getter
@AllArgsConstructor
public abstract class CreditUnit {

    private CreditUnitDigit tensDigit;
    private CreditUnitDigit onesDigit;
    private CreditUnitType type;

    public CreditUnit getPreviousUnit() {
        return CreditUnitCalculator.fromRank(getRank() - 1);
    }

    public CreditUnit getNextUnit() {
        return CreditUnitCalculator.fromRank(getRank() + 1);
    }

    public abstract int getRank();

    public abstract String toString();
}
