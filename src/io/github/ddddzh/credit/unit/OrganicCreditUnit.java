package io.github.ddddzh.credit.unit;

/**
 *
 */
public class OrganicCreditUnit extends CreditUnit {

    public OrganicCreditUnit(CreditUnitDigit digit) {
        super(null, digit, CreditUnitType.Organic);
    }

    @Override
    public int getRank() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return getOnesDigit().toString();
    }
}
