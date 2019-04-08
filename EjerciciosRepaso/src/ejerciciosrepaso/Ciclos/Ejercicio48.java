/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author MASTER
 */
public class Ejercicio48 {
    public void operacion() {
         Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero a: ");
        float a = numero.nextFloat();
        
       int cont=0; 
       for(int i=1; i<=a; i++){
           if(a%i==0){
               cont++;
           }
       }
       
       if (cont==2){
           System.out.println("El número es primo. ");
       }else{
           System.out.println("El número no es primo. ");
       }
        
        
        
    }
}
