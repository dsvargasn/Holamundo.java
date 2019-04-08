/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.Arreglos;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Ejercicio92 {
    
    public Ejercicio92 (int precio, int unidades) {
        
        System.out.print("Digite el número de unidades: ");
        Scanner entrada = new Scanner(System.in);
        unidades = entrada.nextInt();
        
        if (unidades>6) {
            Ejercicio92.mediadocena(unidades, precio);
        }
        
        else {
            Ejercicio92.docena(unidades, precio);
        }
    }
    
    static int mediadocena (int unidades, int precio) {
    
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i<unidades; i++) {
            System.out.print("Ingrese el precio de la unidad [" + unidades + "]: ");
            precio = entrada.nextInt();
            System.out.print("El valor con descuento de 4% es: " + precio*0.04);    
        }
        
        return 0;
    }
    
    static int docena (int unidades, int precio) {
    
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i<unidades; i++) {
            System.out.print("Ingrese el precio de la unidad [" + unidades + "]: ");
            precio = entrada.nextInt();
            System.out.print("El valor con descuento de 10% es: " + precio*0.1);    
        }
        
        return 0;
    }
    
}
