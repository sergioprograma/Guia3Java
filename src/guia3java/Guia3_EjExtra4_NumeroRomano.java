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
public class Guia3_EjExtra4_NumeroRomano {

    /**Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
       muestre su equivalente en romano.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
         Scanner leer = new Scanner(System.in);
         
        System.out.print("\nIngrese numero de 1 a 10 para convertir en Romano:   ");
        int num = leer.nextInt();
        
        while (num<1||num>10){
            System.out.print("\nEl numero debe ser de 1 a 10. Ingrese de nuevo:   ");
        num = leer.nextInt();
            
        }
        switch (num){
            case 1: System.out.println("\nEl Romano correspondiente a "+num+" es | ");
            break;
            case 2: System.out.println("\nEl Romano correspondiente a "+num+" es || ");
            break;
            case 3: System.out.println("\nEl Romano correspondiente a "+num+" es ||| ");
            break;
            case 4: System.out.println("\nEl Romano correspondiente a "+num+" es |V ");
            break;
            case 5: System.out.println("\nEl Romano correspondiente a "+num+" es V ");
            break;
            case 6: System.out.println("\nEl Romano correspondiente a "+num+" es V| ");
            break;
            case 7: System.out.println("\nEl Romano correspondiente a "+num+" es V|| ");
            break;
            case 8: System.out.println("\nEl Romano correspondiente a "+num+" es V||| ");
            break;
            case 9: System.out.println("\nEl Romano correspondiente a "+num+" es |X ");
            break;
            case 10: System.out.println("\nEl Romano correspondiente a "+num+" es X ");
            break;
            
        }
        // TODO code application logic here
    }
    
}
