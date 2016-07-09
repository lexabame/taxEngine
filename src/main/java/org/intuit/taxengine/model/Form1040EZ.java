package org.intuit.taxengine.model;

/**
 * Created by alejandro on 7/8/16.
 */
public class Form1040EZ extends AbstractForm implements IForm {

    private String firsName;
    private String lastName;

    private double total;
    private double taxableInterest;
    private double unemploymentCompensation;
    private double adjustedGrossIncome;
    private double amountRelatedMaritalStatus;
    private double taxableIncome;

    private double federalIncomeTax;
    private double earnedIncomeCredit;
    private double totalPaymentsAndCredit;
    private double tax;
    private double healthCare;
    private double totalTax;

    private double refund;
    private double oweAmount;

    public Form1040EZ(final String name) {
        this.name = name;
    }

    public void setTotal(final double total) {
        this.total = total;
    }

    public void setTaxableInterest(final double taxableInterest) {
        this.taxableInterest = taxableInterest;
    }

    public void setUnemployementCompesation(final double unemployementCompesation) {
        this.unemploymentCompensation = unemployementCompesation;
    }

    public void setAdjustedGrossIncome(final double adjustedGrossIncome) {
        this.adjustedGrossIncome = adjustedGrossIncome;
    }

    public void setAmuntRelatedMaritalStatus(final double amuntRelatedMaritalStatus) {
        this.amountRelatedMaritalStatus = amuntRelatedMaritalStatus;
    }

    public void setTaxableIncome(final double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public void setFederalIncomeTax(final double federalIncomeTax) {
        this.federalIncomeTax = federalIncomeTax;
    }

    public void setEarnedIncomeCredit(final double earnedIncomeCredit) {
        this.earnedIncomeCredit = earnedIncomeCredit;
    }

    public void setTotalPaymentsAndCredit(final double totalPaymentsAndCredit) {
        this.totalPaymentsAndCredit = totalPaymentsAndCredit;
    }

    public void setTax(final double tax) {
        this.tax = tax;
    }

    public void setHealthCare(final double healthCare) {
        this.healthCare = healthCare;
    }

    public void setTotalTax(final double totalTax) {
        this.totalTax = totalTax;
    }

    public void setRefund(final double refund) {
        this.refund = refund;
    }

    public void setOweAmount(final double oweAmount) {
        this.oweAmount = oweAmount;
    }

    public double getTotal() {
        return total;
    }

    public double getTaxableInterest() {
        return taxableInterest;
    }

    public double getUnemployementCompesation() {
        return unemploymentCompensation;
    }

    public double getAdjustedGrossIncome() {
        return adjustedGrossIncome;
    }

    public double getAmuntRelatedMaritalStatus() {
        return amountRelatedMaritalStatus;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public double getFederalIncomeTax() {
        return federalIncomeTax;
    }

    public double getEarnedIncomeCredit() {
        return earnedIncomeCredit;
    }

    public double getTotalPaymentsAndCredit() {
        return totalPaymentsAndCredit;
    }

    public double getTax() {
        return tax;
    }

    public double getHealthCare() {
        return healthCare;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public double getRefund() {
        return refund;
    }

    public double getOweAmount() {
        return oweAmount;
    }

    public void setFirsName(final String firsName) {
        this.firsName = firsName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setUnemploymentCompensation(final double unemploymentCompensation) {
        this.unemploymentCompensation = unemploymentCompensation;
    }

    public void setAmountRelatedMaritalStatus(final double amountRelatedMaritalStatus) {
        this.amountRelatedMaritalStatus = amountRelatedMaritalStatus;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getUnemploymentCompensation() {
        return unemploymentCompensation;
    }

    public double getAmountRelatedMaritalStatus() {
        return amountRelatedMaritalStatus;
    }
}
