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
public class Guia3_EjExtra3_Vocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
//trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
//la función equals() de la clase String.
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese letra\n");
        String letra = leer.next();
        
        if(letra.equalsIgnoreCase("A")||letra.equalsIgnoreCase("E")||letra.equalsIgnoreCase("I")||letra.equalsIgnoreCase("O")||letra.equalsIgnoreCase("U")){
            System.out.println("La letra ingresada es una vocal");
        }else
            System.out.println("La letra ingresada no es una vocal");
    }
    
}
