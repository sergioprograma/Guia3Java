/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3Java;

/**
 *
 * @author usand
 */
public class Guia3_EjApr8_CuadradoAsterisco {
    
//    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
//Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
//lo siguiente:
//* * * *
//*     *
//*     *
//* * * *


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        System.out.println("");
       for (int i=0; i<=3 ; i++){
         for (int j=0; j<=3 ; j++) {
             if (i>0&&i<3&&j>0&&j<3){
                 System.out.print("  ");
             }else
                 System.out.print("* ");
         } 
           System.out.println("");
       }
       
        System.out.println("");// TODO code application logic here
    }
    
}
