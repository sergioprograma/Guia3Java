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
public class Guia3_EjApr7_RS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//      Realizar un programa que simule el funcionamiento de un dispositivo
//RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
//cadenas deben llegar con un formato fijo: tienen que ser de un máximo
//de 5 caracteres de largo, el primer carácter tiene que ser X y el último
//tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas,
//la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
//FDE), y toda secuencia distinta de FDE, que no respete el formato se
//considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de
//lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
//deberá investigar cómo se utilizan las siguientes funciones de Java
//Substring(), Length(), equals().

        
        
        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingresar un formato para RS232");
//        String frase= leer.nextLine(); 
        boolean salir= false;
        int i,j,sumCorr, sumInco;
        i=0;
        j=0;
        String frase;
                
//        System.out.println(frase.substring(0, 1));

        
        do{   
            System.out.println("Ingresar un formato para RS232\n");
            frase= leer.nextLine(); 
            if (frase.substring(0,1).equalsIgnoreCase("X")&& frase.substring(4,5).equalsIgnoreCase("O")&& frase.length()==5){
            System.out.println("\nCORRECTO\n");            
            i++ ;         
            }else if(!frase.equals("&&&&&")){
            System.out.println("\nINCORRECTO\n"); 
            j++;            
            }
         
        }while (!frase.equals("&&&&&"));
          System.out.println("\nLos formatos correctos fueron: " +i+" y los incorrectos "+j); 
        
        // TODO code application logic here
    }
    
}
