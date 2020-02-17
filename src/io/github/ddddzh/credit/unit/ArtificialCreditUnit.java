package io.github.ddddzh.credit.unit;

import java.util.Arrays;

import io.github.ddddzh.credit.unit.utils.CreditUnitRankCalculator;

/**
 *
 */
public class ArtificialCreditUnit extends CreditUnit {

    public ArtificialCreditUnit(CreditUnitDigit tensDigit, CreditUnitDigit onesDigit) {
        super(tensDigit, onesDigit, CreditUnitType.Artificial);
    }

    /**
     * @return
     */
    @Override
    public int getRank() {
        return CreditUnitRankCalculator.calculate(Arrays.asList(
                getTensDigit().getRank(),
                getOnesDigit().getRank()));
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return null;
    }
}
