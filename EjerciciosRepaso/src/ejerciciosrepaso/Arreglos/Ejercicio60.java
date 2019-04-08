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
public class Ejercicio60 {
    public void operacion(){
        int a[]={23, 45, 68, 99, 10, 15, 4};
        int mayor;
        mayor=a[2];
        for(int i=0; i<a.length; i++){
            if(a[i]>mayor){
                mayor=a[i];
                System.out.println("El número mayor es: "+mayor);
            }
            
        }
    }
    
}
