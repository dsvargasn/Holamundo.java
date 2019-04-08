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
public class Ejercicio62 {
    
    public void operacion () {
        
        int [] A = new int [10];
        Scanner entrada = new Scanner (System.in);
        
        for (int i=0; i<10; i++) {
            
            System.out.println("Ingrese el número de la posición [" + i + "]: ");
            int num = entrada.nextInt();
            A [i] = num;
        }
        
        int[] B = new int [10];
        
        for (int i=0; i<10; i++) {
            
            B [i] = A [i];
            
        }
        
        int max = B[0];
        int min = B[0];
        
        for (int i=0; i<10; i++) {
            
            if (min>B[i]) {
                min = B[i];
            }
           
            if (max<B[i]) {
                max = B[i];
            } 
            
        }
        
        System.out.println("El valor mínimo del arreglo es: " + min);
        System.out.println("El valor máximo del arreglo es: " + max);
        
    }
    
}
