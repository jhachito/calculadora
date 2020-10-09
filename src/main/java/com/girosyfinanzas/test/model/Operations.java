package com.girosyfinanzas.test.model;

import com.girosyfinanzas.test.exceptions.CustomException;
import com.girosyfinanzas.test.util.Constant;

public class Operations {
    public double sum(double a, double b){
        return a+b;
    }
    public double rest(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b) throws CustomException {
        if(b==0){
            throw new CustomException(Constant.MESSAGE1);
        }
        return a/b;
    }

}
