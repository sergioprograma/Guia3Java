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
public class Guia3_Ej6_Mayor25 {

    /**
     * @param args the command line arguments
     */
    
//    Implementar un programa que le pida dos números enteros al usuario y
//determine si ambos o alguno de ellos es mayor a 25.


    public static void main(String[] args) {
        
        System.out.println("Ingresar dos numeros a evaluar\n");
        
        System.out.print("Primer Numero: ");
        
        Scanner leer = new Scanner(System.in);
        
        int num1= leer.nextInt();
        
         System.out.print("\nSegundo Numero: ");
         
        int num2= leer.nextInt();
         
         if ((num1>25) && (num2>25)){
             
             System.out.println("\nAmbos numeros, " +num1+ " y " +num2+ " son mayores que 25");
             
            }else if (num1>25){
                
                     System.out.println("\nEl primer numero " +num1+ " es mayor que 25");
                              
            }else if (num2>25){
                     System.out.println("\nEl segundo numero " +num2+ " es mayor que 25");
                     
            }else {
                    System.out.println("\nNingun numero es mayor que 25");
                    
                     
            }// TODO code application logic here
    }   
}
