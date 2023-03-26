/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3Java;

import java.util.Scanner;

/**
 *
 * @author usand
 */
public class Guia3_EjExta1_DiasHoras {
    
//    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
//ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
//equivalente: 1 día, 2 horas.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese minutos a convertir:   ");
        int min = leer.nextInt();
        
        int dias,horas;
        
        dias=min/(60*24);
        horas=min%(60*24)/60;
        
        System.out.println("\n" +min+ " equivalen a "+dias+" dias y "+horas+" horas\n");
        
        // TODO code application logic here
    }
    
}
