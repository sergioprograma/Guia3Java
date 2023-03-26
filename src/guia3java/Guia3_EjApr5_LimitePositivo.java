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
public class Guia3_EjApr5_LimitePositivo {
    
//    Escriba un programa en el cual se ingrese un valor límite positivo, y a
//continuación solicite números al usuario hasta que la suma de los
//números introducidos supere el límite inicial.
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero positivo como limite: ");
        float lim = leer.nextFloat();
        float suma = 0;

        while (suma < lim) {
            System.out.println("Ingresar otro numero");
            float num = leer.nextFloat();
            suma += num;
            System.out.println("Sumando " + num + " la suma parcial es. " + suma);    

        }

    }

}
