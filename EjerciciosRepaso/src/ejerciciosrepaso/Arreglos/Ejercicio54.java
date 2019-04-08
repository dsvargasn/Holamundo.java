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
public class Ejercicio54 {
    public void operacion(){
        int [] a = new int[100];
        int n=1;
        int acum=0;
        
        for(int i=0; i<100; i++){
            a[i]=n++;
            if(a[i]%2==0){
                System.out.println(a[i]+" ");
            }
        }
    }
}
