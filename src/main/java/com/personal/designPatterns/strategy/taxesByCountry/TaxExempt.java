package com.personal.designPatterns.strategy.taxesByCountry;

import java.math.BigDecimal;

public class TaxExempt implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal amount) {
        return BigDecimal.ZERO;
    }
}
