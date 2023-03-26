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
public class Guia3_EjExtra6_PromedioAltura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Leer la altura de N personas y determinar el promedio de estaturas que
//se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
//general.
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Indicar el numero de personas de las que se va a medir la altura:  ");
         int per = leer.nextInt();
         
        float sumaGeneral=0;
        float sumaMenor=0;
        float promGeneral=0;
        float promMenor=0;
        for (int i=1; i<=per; i++){
            
        System.out.print("\nIngrese la altura en metros de la persona " +i+" :   ");
        float alt = leer.nextFloat();
        
            
        
        sumaGeneral=sumaGeneral+alt;
        promGeneral=sumaGeneral/i;
        
        
            
        int j=0;    
        if (alt<1.6){
            
            sumaMenor=sumaMenor+alt;
                    j++;
                    promMenor=sumaMenor/j;
                    
                    
                    
        }    
            
        }    
        System.out.println("*****************************************");
        System.out.println("\nEl promedio de altura general es: " +promGeneral);
        System.out.println("\nEl promedio de altura debajo de 1.60m es: " +promMenor);
        System.out.println("\n*****************************************");
    }
    
}
