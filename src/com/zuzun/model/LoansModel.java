package com.zuzun.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoansModel {
    //calculated values
    private Boolean loansStatus;
    private double loansLimit ;
}
