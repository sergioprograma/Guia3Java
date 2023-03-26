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
public class Gui3_EjApr2_Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Crear un programa que pida una frase y si esa frase es igual a “eureka” el
//programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
//Incorrecto. Nota: investigar la función equals() en Java.
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar una frase para evaluar si es igual a eureka\n");
        String frase= leer.nextLine();
        
        if (frase.equals("eureka")){
            System.out.println("\nCorrecto\n");
        }else
            System.out.println("\nIncorrecto\n");
        
        
    }
    
}
