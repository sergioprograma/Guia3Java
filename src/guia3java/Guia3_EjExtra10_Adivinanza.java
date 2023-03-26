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
public class Guia3_EjExtra10_Adivinanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Realice un programa para que el usuario adivine el resultado de una
//multiplicación entre dos números generados aleatoriamente entre 0 y 10.
//El programa debe indicar al usuario si su respuesta es o no correcta. En
//caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
//su respuesta nuevamente. Para realizar este ejercicio investigue como
//utilizar la función Math.random() de Java.
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        int res;
        int adiv;
        
        res=num1*num2;
        System.out.println(res);
        do{
            System.out.print("\nAdivinar el resultado de la multiplicacion:  ");        
         
         adiv = leer.nextInt();
         
         if (adiv!=res){
            System.out.println("Error. Ingresar de nuevo");
            System.out.println("**********************************");
         }else{
             System.out.println("\n**********************************");
             System.out.println("Genio!!!! Adivinaste la respuesta!!!"); 
             System.out.println("**********************************");
             
         }
              
             
           
        }while (adiv!=res);
         
         
         
    }
    
}
