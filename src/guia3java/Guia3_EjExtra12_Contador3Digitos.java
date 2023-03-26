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
public class Guia3_EjExtra12_Contador3Digitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
//números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
//aparezca un 3 lo sustituya por una E. Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
//0-1-2
//0-1-E
//Nota: investigar función equals() y como convertir números a String.
        // TODO code application logic here
        
        String num1;
        String num2;       
        String num3;

     
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){ 
                for (int k = 0; k < 10; k++) {
                    
                num1= String.valueOf(i);   
                num2= String.valueOf(j); 
                num3= String.valueOf(k); 
//     numero = Integer.toString(i) + "-" + Integer.toString(j) + "-" + Integer.toString(k);            
                if( num1.equals("3")){                    
                 num1="E";  

                }
                
                if( num2.equals("3")){                    
                 num2="E";               

                }
                if( num3.equals("3")){                    
                 num3="E";               

                }
                System.out.println(num1+"-"+num2+"-"+num3);                                

                    
                }
                
            }
            
        }
        
    }
    
}
