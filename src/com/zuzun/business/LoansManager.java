package com.zuzun.business;

import com.zuzun.model.LoansModel;
import com.zuzun.model.LoansParameterModel;
import com.zuzun.service.IBaseLoans;

public class LoansManager {

    IBaseLoans iBaseLoans;
    LoansModel loansModel;

    public LoansManager(IBaseLoans iBaseLoans){
        this.iBaseLoans=iBaseLoans;
    }

    public LoansModel loansCalculated(LoansParameterModel loansParameterModel) throws Exception {

        return iBaseLoans.getLoansCalculation(loansParameterModel);
    }

}
