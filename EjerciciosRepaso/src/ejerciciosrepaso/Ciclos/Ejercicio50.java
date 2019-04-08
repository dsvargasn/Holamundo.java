/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.Ciclos;

/**
 *
 * @author santi
 */
public class Ejercicio50 {
    
    public void operacion () {
        
        int pares = 0;
        int impares = 0;
        int j = 0;
        int q = 0;
        for (int i=1; i<=201; i++) {
            if (i % 2 == 0) {
                pares+=i;   
                j++;
            }
            else {
                impares+=i;       
                q++;
            }
        }
        System.out.println("La suma de los impares de 1 a 200 es: " + impares);
        System.out.println("Y su media es: " + impares/q);
        System.out.println("La suma de los pares de 1 a 200 es: " + pares);
        System.out.println("Y su media es: " + pares/j);
    }
}