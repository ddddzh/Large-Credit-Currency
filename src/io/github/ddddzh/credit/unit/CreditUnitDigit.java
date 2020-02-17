package io.github.ddddzh.credit.unit;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 *
 */
@AllArgsConstructor
@EqualsAndHashCode
public class CreditUnitDigit {
    private char digitChar;
    @Getter
    private CreditUnitDigitRank rank;

    public String toString() {
        return String.valueOf(digitChar);
    }
}
