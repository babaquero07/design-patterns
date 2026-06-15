package com.personal.designPatterns.strategy.taxesByCountry;

import java.math.BigDecimal;

public interface TaxCalculator {
    BigDecimal calculateTax(BigDecimal amount);
}
