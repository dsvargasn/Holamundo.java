/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.Arreglos;

/**
 *
 * @author santi
 */
public class Ejercicio56 {
     
    public void operacion () {
        int[] A = new int [5];
        A [0] = 1;
        A [1] = 2;
        A [2] = 3;
        A [3] = 4;
        A [4] = 5;
        
        int [] B = new int [5];
        for (int i=0; i<=5; i++) {
            B [i] = A [i];
            System.out.println("El arreglo A en la posición [" + i + "] es: " + A [i]);
            System.out.println("La copia del arreglo A es: " + B [i]);
        }
        
        
    }
    
}
