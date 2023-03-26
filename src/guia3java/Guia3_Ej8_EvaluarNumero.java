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
public class Guia3_Ej8_EvaluarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
//y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
         System.out.println("Ingresar una nota entre 0 y 10");
         Scanner leer = new Scanner(System.in);
         
          Float nota = leer.nextFloat();
          
           while ((nota<0)|| (nota>10)) {
           System.out.println("La nota debe estar entre 0 y 10");
           nota = leer.nextFloat();
           }// TODO code application logic here
    }
    
}
