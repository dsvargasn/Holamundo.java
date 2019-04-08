/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author MASTER
 */
public class Ejercicio66 {
    public void operacion(){
        int [][] mult = {{5,6,13},{14,2,4},{21,7,6}};
        int total;
        
        for(int i=0; i<mult.length; i++){
            for(int j=0; j<mult[i].length; j++){
                total=mult[i][j]*2;
                System.out.println(total);
            }
        }
        
       
    }
    
}
