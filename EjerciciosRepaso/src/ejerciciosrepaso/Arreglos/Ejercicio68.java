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
public class Ejercicio68 {
    public void operacion() {
        
        int Matriz [][] = {{5,6,7,9},{11,8,2,0}};
        int suma = 0, suma1 = 0;
        
        for (int i=0; i<1; i++) {
            suma = 0;
            for (int j=0; j<4; j++) {
                suma += Matriz [i][j]; 
            }
        }
        
        for (int i=1; i<2; i++) {
            suma1 = 0;
            for (int j=0; j<4; j++) {
                suma1 += Matriz [i][j]; 
            }
        }
        
        System.out.println("Resultado primer fila: " + suma);
        System.out.println("Resultado segunda fila: " + suma1);
        
    }   
    
}
