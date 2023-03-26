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
public class Guia3_EjExtra5_SociosMutual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Una obra social tiene tres clases de socios:
//○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
//descuento en todos los tipos de tratamientos.
//○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
//descuento para los mismos tratamientos que los socios del tipo A.
//○ Los socios que menos aportan, los de tipo ‘C’, no reciben
//descuentos sobre dichos tratamientos.
//○ Solicite una letra (carácter) que representa la clase de un socio, y
//luego un valor real que represente el costo del tratamiento (previo
//al descuento) y determine el importe en efectivo a pagar por dicho
//socio.
        Scanner leer = new Scanner(System.in);

        System.out.print("\nIngrese la clase de socio A, B o C:   ");
        String clase = leer.next();

        while (!clase.equalsIgnoreCase("A") && !clase.equalsIgnoreCase("B") && !clase.equalsIgnoreCase("C")) {
            System.out.print("\nLa clase debe ser A, B o C. Ingrese de nuevo:   ");
            clase = leer.next();

        }
        System.out.print("\nIngrese el costo del tratamiento: $ ");

        float trat = leer.nextFloat();

        switch (clase) {
            case "a":
                System.out.println("\nEl importe a pagar por el tratamiento es $ " +(trat * 0.5));
                break;
            case "b":
                System.out.println("\nEl importe a pagar por el tratamiento es $ " +(trat * 0.65));
                break;
            case "c":
                System.out.println("\nEl importe a pagar por el tratamiento es $ " +(trat));
                break;

        }
        // TODO code application logic here
    }

}
