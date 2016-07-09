package org.intuit.taxengine.model;

/**
 * Created by alejandro on 7/9/16.
 */
public class TaxModel {

    private double topRange;
    private double tax;

    public TaxModel(final double topRange, final double tax) {
        this.topRange = topRange;
        this.tax = tax;
    }

    public double getTopRange() {
        return topRange;
    }

    public double getTax() {
        return tax;
    }

    public void setTopRange(final double topRange) {
        this.topRange = topRange;
    }

    public void setTax(final double tax) {
        this.tax = tax;
    }
}
