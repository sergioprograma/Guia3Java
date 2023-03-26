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
public class Guia3_EjExtra13_EscaleraNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Crear un programa que dibuje una escalera de números, donde cada
//línea de números comience en uno y termine en el número de la línea.
//Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
//ingresa el número 3:
//1 
//12
//123
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingresar numero para construir en escalera\n");
         
         int num = leer.nextInt(); 

        for (int i = 0; i < num; i++) {
            for (int j = 1; j <i+2; j++) {
                
                System.out.print(j);                
            }
            System.out.println("");
        }
        
        
    }
    
}
