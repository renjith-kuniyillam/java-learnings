package com.SimpleInterestCalculator;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
    public BigDecimal getPrincipal() {
        return principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public int getNoOfYears() {
        return noOfYears;
    }

    private BigDecimal principal;
    private BigDecimal interest;
    private int noOfYears;

    public SimpleInterestCalculator(String principal, String rateOfInterest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(rateOfInterest);
    }

    public BigDecimal calculateTotalValue(int noOfYears) {
        return this.principal.add(this.principal.multiply(new BigDecimal(noOfYears)).multiply(this.interest.divide(new BigDecimal(100))));
    }

}
