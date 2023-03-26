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
public class Gui3_EjApr1_ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Crear un programa que dado un número determine si es par o impar.
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int num= leer.nextInt();
        
        if (num%2==0){
            System.out.println("\n"+num+ " es par\n");
        }else
           System.out.println("\n"+num+ " es impar\n"); 
        // TODO code application logic here
    }
    
}
