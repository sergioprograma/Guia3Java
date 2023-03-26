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
public class Guia3_Ej9_20Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Escriba un programa que lea 20 números. Si el número leído es igual a cero se
//debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
//programa deberá calcular y mostrar el resultado de la suma de los números
//leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
//de la sentencia break.
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar numeros hasta que uno sea cero "
                + "o se completen 20 entradas");
        
         float num;
         int cont= 0;
           float suma=0 ;
           
        do {
            System.out.print("Ingrese el numero de entrada " +(cont+1)+" :  ");
            num = leer.nextFloat();
            if ( num==0.0 ){
                System.out.println("Se capturo el numero cero");
                break;
            }

            if (num>0){
            suma+=num;
                System.out.println("La suma parcial es " +suma);
            }else {
                System.out.println("El numero negativo no participa de la suma");
            }
            cont++;

       } while (cont<20);
        
        System.out.println("\nSe completaron "+cont+ " entradas con "
                + "suma total de enteros positivos " +suma+ "\n");
        // TODO code application logic here
    }

}
