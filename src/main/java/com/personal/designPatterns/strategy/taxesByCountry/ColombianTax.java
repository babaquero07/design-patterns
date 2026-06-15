package com.personal.designPatterns.strategy.taxesByCountry;

import java.math.BigDecimal;

public class ColombianTax implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal amount) {
        return amount.multiply(new BigDecimal("0.19"));
    }
}
