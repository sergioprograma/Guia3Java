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
public class Guia3_EjApr4_EmpiezaConA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Escriba un programa que pida una frase o palabra y valide si la primera
//letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
//imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
//contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
//Substring y equals() de Java.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar una frase para evaluar si empieza con A");
        String frase= leer.nextLine();       
//        System.out.println(frase.substring(0, 1));

        if (frase.substring(0,1).equals("A")){
            System.out.println("CORRECTO");            
                       
            }else{
            System.out.println("INCORRECTO, empieza con: "+frase.substring(0,1)); 
           
            
        }
           
    }
        // TODO code application logic here
}
    
