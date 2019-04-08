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
public class Ejercicio74 {
    
    public void operacion () {
        
        String cadena;
        System.out.print("Ingrese su cadena: ");
        Scanner entrada = new Scanner (System.in);
        cadena = entrada.nextLine();
        
        StringBuilder invertida = new StringBuilder(cadena);
        String sCadenaInvertida = invertida.reverse().toString();
        
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + sCadenaInvertida);
    }
    
}
