package org.intuit.taxengine.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alejandro on 7/9/16.
 */
public class TaxTableModel {

    private List<TaxModel> taxTable = new ArrayList<TaxModel>();

    public TaxTableModel() {

        inicializeTaxTable();

    }

    private void inicializeTaxTable() {

        TaxModel taxModelA = new TaxModel(5000, 10);

        TaxModel taxModelB = new TaxModel(10000, 12);

        TaxModel taxModelC = new TaxModel(15000, 15);

        TaxModel taxModelD = new TaxModel(30000, 20);

        TaxModel taxModelE = new TaxModel(50000, 25);

        taxTable.add(taxModelA);

        taxTable.add(taxModelB);

        taxTable.add(taxModelC);

        taxTable.add(taxModelD);

        taxTable.add(taxModelE);

    }

    public List<TaxModel> getTaxTable() {
        return taxTable;
    }
}
