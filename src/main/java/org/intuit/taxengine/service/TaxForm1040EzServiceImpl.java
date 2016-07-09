package org.intuit.taxengine.service;

import org.intuit.taxengine.model.Form1040EZ;
import org.intuit.taxengine.model.IForm;
import org.intuit.taxengine.model.TaxTableModel;
import org.intuit.taxengine.rules.Tax1040EzFormRuleImpl;

/**
 * Created by alejandro on 7/8/16.
 */
public class TaxForm1040EzServiceImpl implements ITaxFormService {

    private Tax1040EzFormRuleImpl taxRule;

    public void setTaxRule(final Tax1040EzFormRuleImpl taxRule) {
        this.taxRule = taxRule;
    }

    public Form1040EZ calculateTax(final IForm form) {

        Form1040EZ form1040EZ = (Form1040EZ) form;

        form1040EZ = taxRule.calculateAdjustedGrossIncome(form1040EZ);

        form1040EZ = taxRule.calculateTaxableIncome(form1040EZ);

        form1040EZ = taxRule.calculateTotalPaymentsAndCredits(form1040EZ);

        TaxTableModel taxTableModel = new TaxTableModel();

        form1040EZ =  taxRule.getTaxFromTaxTable(form1040EZ, taxTableModel);

        form1040EZ = taxRule.calculateTotalTax(form1040EZ);

        form1040EZ = taxRule.calculateRefundAndOwe(form1040EZ);

        return form1040EZ;
    }
}
