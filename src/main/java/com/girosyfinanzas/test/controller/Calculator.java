/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girosyfinanzas.test.controller;

import com.girosyfinanzas.test.exceptions.CustomException;
import com.girosyfinanzas.test.model.Operations;
import com.girosyfinanzas.test.model.VariablesDeEntrada;
import com.girosyfinanzas.test.util.Constant;
import com.girosyfinanzas.test.util.Printer;
import com.girosyfinanzas.test.util.ScannerHandler;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sheva
 */
public class Calculator {

    ScannerHandler scannerHandler = new ScannerHandler();
    VariablesDeEntrada variablesDeEntrada = new VariablesDeEntrada();
    Operations operations = new Operations();
    Printer printer = new Printer();
    double result;
    public void start() throws CustomException {
        int number = Menu();
        String salida = "";

        try {
            switch (number) {
                case 1:
                    System.out.println("##########SUMA###########");
                        variablesDeEntrada.setA(scannerHandler.ScannerH());
                        variablesDeEntrada.setB(scannerHandler.ScannerH());
                        result = operations.sum(variablesDeEntrada.getA(), variablesDeEntrada.getB());
                        salida = printer.salida(variablesDeEntrada.getA(), variablesDeEntrada.getB(), "+",result);
                        System.out.println("Suma: "+salida);
                    break;
                case 2:
                    System.out.println("##########RESTA##########");
                        variablesDeEntrada.setA(scannerHandler.ScannerH());
                        variablesDeEntrada.setB(scannerHandler.ScannerH());
                        double result = operations.rest(variablesDeEntrada.getA(), variablesDeEntrada.getB());
                        salida = printer.salida(variablesDeEntrada.getA(), variablesDeEntrada.getB(), "-",result);
                        System.out.println("Resta: "+salida);
                    break;
                case 3:
                    System.out.println("##########MULTIPLICAR##########");
                        variablesDeEntrada.setA(scannerHandler.ScannerH());
                        variablesDeEntrada.setB(scannerHandler.ScannerH());
                        result = operations.multiply(variablesDeEntrada.getA(), variablesDeEntrada.getB());
                        salida = printer.salida(variablesDeEntrada.getA(), variablesDeEntrada.getB(), "*",result);
                        System.out.println("Multipicación: "+salida);
                    break;
                case 4:
                    System.out.println("##########DIVIDIR##########");
                        variablesDeEntrada.setA(scannerHandler.ScannerH());
                        variablesDeEntrada.setB(scannerHandler.ScannerH());
                        result = operations.divide(variablesDeEntrada.getA(), variablesDeEntrada.getB());
                        System.out.println("Division: "+ variablesDeEntrada.getA()+"/"+variablesDeEntrada.getB()+" = "+result);
                    break;
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }


    public int Menu(){
        Scanner sc = new Scanner(System.in);
        int number;
        boolean start;
        do {
            System.out.println("Ingrese una opcion de la lista!");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            while (!sc.hasNextInt())
            {
                System.out.println("No es un numero entero!");
                sc.next();
            }
            number = sc.nextInt();
            start = number > 0 && number < 6;
        } while (!start);
        return number;
    }
}
