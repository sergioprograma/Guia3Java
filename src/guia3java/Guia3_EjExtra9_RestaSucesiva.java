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
public class Guia3_EjExtra9_RestaSucesiva {
//    Simular la división usando solamente restas. Dados dos números enteros
//mayores que uno, realizar un algoritmo que calcule el cociente y el
//residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y
//el número de restas realizadas es el cociente.
//Por ejemplo: 50 / 13:
//50 – 13 = 37 una resta realizada
//37 – 13 = 24 dos restas realizadas
//24 – 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
//3.
//¿Aún no lo entendiste? Recomendamos googlear división con restas
//sucesivas.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
         System.out.print("\nRealizar division usando resta sucesivas");
         
         System.out.print("\nIngresar numerador:  ");
         int num = leer.nextInt();
         
         System.out.print("\nIngresar divisor:  ");
         int div = leer.nextInt();
         
         int resto=0;
         int i=0;
        // TODO code application logic here
        System.out.print("\nEl cociente de: "+num+"/"+div);
        
        do{
            num-=div;
            resto=num;        
            i++;
        }while(resto>div);
        
        System.out.println(" es= "+i+" con un resto de "+resto+"\n");
        
    }
    
}
