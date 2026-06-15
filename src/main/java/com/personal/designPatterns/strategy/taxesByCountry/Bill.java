package com.personal.designPatterns.strategy.taxesByCountry;

import java.math.BigDecimal;

public class Bill {
    private String companyName;
    private BigDecimal total;
    private TaxCalculator taxCalculator;

    public Bill(TaxCalculator taxCalculator, BigDecimal total, String companyName) {
        this.taxCalculator = taxCalculator;
        this.total = total;
        this.companyName = companyName;
    }

    public void printTax() {
        BigDecimal tax = taxCalculator.calculateTax(this.total);
        System.out.println("Los impuestos para esta factura son: " + tax);
    }
}
