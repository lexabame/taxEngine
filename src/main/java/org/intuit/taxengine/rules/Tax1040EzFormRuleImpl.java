package org.intuit.taxengine.rules;

import org.intuit.taxengine.model.Form1040EZ;
import org.intuit.taxengine.model.TaxModel;
import org.intuit.taxengine.model.TaxTableModel;


/**
 * Created by alejandro on 7/8/16.
 */
public class Tax1040EzFormRuleImpl {

    private float federalIcomeTax;
    private float earnedIncomeCredit;

    public boolean validateTotal(final Form1040EZ form) {

        Form1040EZ form1040EZ = (Form1040EZ) form;

        return form1040EZ.getTotal() <= 1500;

    }

    public Form1040EZ calculateAdjustedGrossIncome(final Form1040EZ form) {

        double adjustedGrossIncome  = form.getTotal() + form.getTaxableInterest() + form.getUnemployementCompesation();

        form.setAdjustedGrossIncome(adjustedGrossIncome);

        return form;
    }

    public Form1040EZ calculateTaxableIncome(Form1040EZ form){

        double taxableIncome = 0;

        if(form.getAmuntRelatedMaritalStatus() > form.getAdjustedGrossIncome()){
            form.setTaxableIncome(taxableIncome);
        }
        else{
            taxableIncome = form.getAdjustedGrossIncome() - form.getAmuntRelatedMaritalStatus();
            form.setTaxableIncome(taxableIncome);
        }

        return form;

    }

    public Form1040EZ calculateTotalPaymentsAndCredits(Form1040EZ form){

        form.setTotalPaymentsAndCredit(federalIcomeTax + earnedIncomeCredit);

        return form;

    }

    public Form1040EZ getTaxFromTaxTable(Form1040EZ form, TaxTableModel taxTableModel){

        double taxPercentage = 0;
        double taxAmount = 0;

        for(TaxModel taxModel : taxTableModel.getTaxTable()){

            if((form.getTaxableIncome() < taxModel.getTopRange())){

                taxPercentage = taxModel.getTax();

                taxAmount = (taxPercentage * form.getTaxableIncome()) / 100;

                form.setTax(taxAmount);

                break;

            }else{

                taxPercentage = taxModel.getTax();

                taxAmount = (taxPercentage * form.getTaxableIncome()) / 100;

                form.setTax(taxAmount);

            }

        }
        return form;

    }

    public Form1040EZ calculateTotalTax(Form1040EZ form){

        form.setTotalTax(form.getTax() + form.getHealthCare());
        return form;

    }

    public Form1040EZ calculateRefundAndOwe(Form1040EZ form){

        if(form.getTotalPaymentsAndCredit() > form.getTotalTax()){
            form.setRefund(form.getTotalPaymentsAndCredit() - form.getTotalTax());
        }
        else if(form.getTotalTax() > form.getTotalPaymentsAndCredit()){
            form.setOweAmount(form.getTotalTax() - form.getTotalPaymentsAndCredit());
        }

        return form;

    }

    public void setFederalIncomeTax(float federalIncomeTax) {
        this.federalIcomeTax = federalIncomeTax;
    }

    public float getFederalIncomeTax() {
        return federalIcomeTax;
    }

    public void setEarnedIncomeCredit(final float earnedIncomeCredit) {
        this.earnedIncomeCredit = earnedIncomeCredit;
    }

    public float getEarnedIncomeCredit() {
        return earnedIncomeCredit;
    }

}
