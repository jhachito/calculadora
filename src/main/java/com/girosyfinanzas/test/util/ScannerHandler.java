/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girosyfinanzas.test.util;

import com.girosyfinanzas.test.exceptions.CustomException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sheva
 */
public class ScannerHandler {

    public double ScannerH() throws CustomException {

        System.out.println("Ingrese un valor");
        Scanner a = new Scanner(System.in);
        double salida;
        try {
            salida = a.nextDouble();
        }catch (InputMismatchException e){
            throw new CustomException(Constant.MESSAGE0);
        }
        return salida;
    }

}
