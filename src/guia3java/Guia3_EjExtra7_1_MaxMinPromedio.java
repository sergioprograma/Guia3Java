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
public class Guia3_EjExtra7_1_MaxMinPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Realice un programa que calcule y visualice el valor máximo, el valor
//mínimo y el promedio de n números (n>0). El valor de n se solicitará al
//principio del programa y los números serán introducidos por el usuario.
//Realice dos versiones del programa, una usando el bucle “while” y otra
//con el bucle “do - while”.
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Indicar cantidad de numeros para operar :  ");
         int cant = leer.nextInt();
         int i=0;
         float max=0;
         float min=0;
         float sum=0;
         float prom=0;
         
         while (cant>i){
         
             
         System.out.print("\nIngrese numeros positivos:  ");
         int num = leer.nextInt(); 
         
         if (num>=0){
             if (max<num){
                 max=num;
             }
             
             if (i<1){
                 min=num;
             }
             if (min>num){
                 min=num;
             }
             sum=sum+num;
             i++;
         }
         }
         prom=sum/i;
         System.out.println("\nEl maximo es: "+max+" , el minimo es: "+min+" y el promedio es: "+prom+"\n");
    }
    
}
