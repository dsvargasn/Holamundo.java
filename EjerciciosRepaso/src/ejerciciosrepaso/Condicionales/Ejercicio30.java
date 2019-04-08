/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Ejercicio30 {
    public void operacion(){
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero a: ");
        float a = numero.nextFloat();
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingrese un numero b: ");
        float b = numero1.nextFloat();
        
        if(a>b){
            
            System.out.println("a= " + b + " y " + "b= " + a);
            
        }else{
            System.out.println("a= " + a + " y " + "b= " + b);
        }
    }
    
}
