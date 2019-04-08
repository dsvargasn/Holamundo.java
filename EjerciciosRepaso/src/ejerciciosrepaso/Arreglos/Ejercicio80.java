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
public class Ejercicio80 {
    
    public void operacion () {
        
        String cadena;
        System.out.print("Ingrese su cadena: ");
        Scanner entrada = new Scanner (System.in);
        cadena = entrada.nextLine();
        
        for (int i=0; i<4; i++) {
            if (i%2 == 0) {
                int codigo = cadena.charAt(i) + 2;
                System.out.print(codigo + " ");
            }
            else {
                int codigo = cadena.charAt(i) + 3;
                System.out.print(codigo + " ");
            }
        }
        
    }
    
}
