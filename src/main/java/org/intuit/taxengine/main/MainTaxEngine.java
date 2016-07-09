package org.intuit.taxengine.main;

import org.intuit.taxengine.model.Form1040EZ;
import org.intuit.taxengine.model.IForm;
import org.intuit.taxengine.service.ITaxFormService;
import org.intuit.taxengine.service.TaxForm1040EzServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Created by alejandro on 7/9/16.
 */
public class MainTaxEngine {

    public static void main(String args[]){

        String firstNameAndInitial = "";
        String lastName = "";
        String wages = "";
        String taxableInterest = "";

        Scanner scanIn = new Scanner(System.in);

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-config.xml");

        ITaxFormService taxServiceBean = (TaxForm1040EzServiceImpl) context.getBean("taxSeviceBean");

        System.out.println("Please enter your first name and initial: ");

        firstNameAndInitial = scanIn.nextLine();

        System.out.println("Please enter your last name: ");

        lastName = scanIn.nextLine();

        System.out.println("Wages, Salary, Tips: ");

        wages = scanIn.nextLine();

        System.out.println("Taxable Interest: ");

        taxableInterest = scanIn.nextLine();

        Form1040EZ form = new Form1040EZ("Form1040EZ");

        form.setFirsName(firstNameAndInitial);
        form.setLastName(lastName);
        form.setTotal(Double.parseDouble(wages));
        form.setTaxableInterest(Double.parseDouble(taxableInterest));

        form = (Form1040EZ) taxServiceBean.calculateTax(form);

        System.out.println("Refund: " + form.getRefund());

        System.out.println("Amount you Owe: " + form.getOweAmount());

    }
}
