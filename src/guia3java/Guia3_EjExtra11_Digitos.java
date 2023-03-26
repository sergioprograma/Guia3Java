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
public class Guia3_EjExtra11_Digitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Escribir un programa que lea un número entero y devuelva el número de
//dígitos que componen ese número. Por ejemplo, si introducimos el
//número 12345, el programa deberá devolver 5. Calcular la cantidad de
//dígitos matemáticamente utilizando el operador de división. Nota:
//recordar que las variables de tipo entero truncan los números o
//resultados.
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar un numero para contar sus digitos:   ");
        int num = leer.nextInt();
        int i=0;
        int par=num;

        do {
            
         par=(num/10);
         num=par;
         i++;
//            System.out.println(num);
        } while (num>0);
        System.out.println("\n"+i);

         
    }
    
}
