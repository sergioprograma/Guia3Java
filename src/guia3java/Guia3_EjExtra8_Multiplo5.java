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
public class Guia3_EjExtra8_Multiplo5 {
    
//    Escriba un programa que lea números enteros. Si el número es múltiplo
//    de cinco debe detener la lectura y mostrar la cantidad de números
//     leídos, la cantidad de números pares y la cantidad de números impares.
//    Al igual que en el ejercicio anterior los números negativos no deben
//    sumarse. Nota: recordar el uso de la sentencia break.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
         System.out.print("\nIngresar numeros enteros y finalizar con multiplo de 5\n");
         int num;
         int par=0;
         int imp=0;
         int i=0;
        do{
            
         System.out.print("\nIndicar numero "+(i+1)+" :  ");
         num = leer.nextInt();         
         
         if (num>0){
             
             if (num%2==0){
             par++;
            }else{
             imp++;
            }
         }
             
          i++;  
        }while(num%5!=0);
        
        System.out.print("\nLa cantidad de numeros leidos es: "+i+ 
                " , la cantidad de pares es: "+par+ " y la de impares es: " +imp+"\n");
    }
    
}
