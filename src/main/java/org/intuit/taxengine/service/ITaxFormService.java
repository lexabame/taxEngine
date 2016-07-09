package org.intuit.taxengine.service;

import org.intuit.taxengine.model.IForm;

/**
 * Created by alejandro on 7/8/16.
 */
public interface ITaxFormService {

    IForm calculateTax(IForm form);
}
