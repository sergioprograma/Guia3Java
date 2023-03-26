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
public class Guia3_EjExtra14_Familias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Se dispone de un conjunto de N familias, cada una de las cuales tiene
//una M cantidad de hijos. Escriba un programa que pida la cantidad de
//familias y para cada familia la cantidad de hijos para averiguar la media
//de edad de los hijos de todas las familias.
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
         System.out.print("\nIngresar numero de familias: ");
         
         int n = leer.nextInt(); 
         int m ,edad;
         int suma=0;
         int k=0;
         for (int i = 1; i < n+1; i++) {
             System.out.print("\nIngresar numero de hijos familia "+i+": ");         
             m = leer.nextInt(); 
             for (int j = 1; j < m+1; j++) {
               System.out.print("\nIngresar años de edad hijo "+j+" de la familia "+i+": ");         
             edad = leer.nextInt(); 
             suma=suma+edad;
             k++;
             }
            
        }
        System.out.println("\n***********************************************************"); 
        System.out.println("La media de edad de todos los hijos es de: "+suma/k+ " años de edad");
        System.out.println("***********************************************************\n");
    }
    
}
