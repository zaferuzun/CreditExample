package com.zuzun.service;


import com.zuzun.model.LoansModel;
import com.zuzun.model.LoansParameterModel;

public interface IBaseLoans {

    //calculated loans
    LoansModel getLoansCalculation(LoansParameterModel loansParameterModel) throws Exception;

}
