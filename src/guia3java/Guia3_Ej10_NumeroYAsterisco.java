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
public class Guia3_Ej10_NumeroYAsterisco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
//el número ingresado seguido de tantos asteriscos como indique su valor. Por
//ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **
        // TODO code application logic here
        
        
        System.out.print("\nIngresar numero entre 1 y 20 para seguir de asteriscos: ");
        Scanner leer = new Scanner(System.in);
        
        int num= leer.nextInt();    
        
            
        while (num<1 && num>20){
        
        System.out.print("\nEl numero debe estar entre 1 y 20: ");
        num= leer.nextInt();
         
        }System.out.print("\n" +num+ " ");  
        
        for (int i=1; i<=num; i++){
            
            System.out.print("*");
            
        }
        System.out.println("\n");
}   }       
        
      

    

