package com.girosyfinanzas.test.main;

import com.girosyfinanzas.test.controller.Calculator;
import com.girosyfinanzas.test.exceptions.CustomException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sheva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CustomException{

        Calculator calculator = new Calculator();
        calculator.start();

    }
}
