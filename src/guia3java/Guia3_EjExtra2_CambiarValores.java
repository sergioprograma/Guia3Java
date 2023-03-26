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
public class Guia3_EjExtra2_CambiarValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
//diferente a cada una. A continuación, realizar las instrucciones
//necesarias para que: B tome el valor de C, C tome el valor de A, A tome
//el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
//valores finales de cada variable. Utilizar sólo una variable auxiliar.
        // TODO code application logic here
        
        int A=5;
        int B=10;
        int C=15;
        int D=20;
        int aux;
        
        System.out.println("Valores iniciales: \n"
        +"                  A="+A+"\n"
        +"                  B="+B+"\n"
        +"                  C="+C+"\n"
        +"                  D="+D+"\n");
        
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("B tome el valor de C, C tome el valor de A, A tome\n" +
                             " el valor de D y D tome el valor de B\n");
        System.out.println("Valores finales: \n"
        +"                  A="+A+"\n"
        +"                  B="+B+"\n"
        +"                  C="+C+"\n"
        +"                  D="+D+"\n");
        
        
        
        
        
    }
    
}
