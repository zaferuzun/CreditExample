package com.zuzun;

import com.zuzun.business.LoansManager;
import com.zuzun.model.LoansModel;
import com.zuzun.model.LoansParameterModel;
import com.zuzun.service.imp.CarLoansService;
import com.zuzun.service.imp.PersonalLoansService;

public class Main {

    public static void main(String[] args) throws Exception {

        LoansManager loansManager = new LoansManager(new PersonalLoansService());
//        PersonalModel.builder().accountSalary(4000).accountScore(500).build()

        LoansParameterModel loansParameterModel = LoansParameterModel.builder().accountSalary(4000).accountScore(500).build();

        LoansModel loansModel = (LoansModel) loansManager.loansCalculated(loansParameterModel);

        System.out.println(loansModel.getLoansStatus() + " " + loansModel.getLoansLimit());

        LoansManager loansManager2 = new LoansManager(new CarLoansService());
        LoansParameterModel loansParameterModel2 = LoansParameterModel.builder().accountSalary(6000).accountScore(500).mortgage(120000).build();
        LoansModel loansModel2 = (LoansModel) loansManager2.loansCalculated(loansParameterModel2);
        System.out.println(loansModel2.getLoansStatus() + " " + loansModel2.getLoansLimit());
    }

}
