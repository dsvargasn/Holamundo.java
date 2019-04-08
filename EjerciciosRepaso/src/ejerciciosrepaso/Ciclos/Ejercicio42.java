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
public class Ejercicio42 {
    public void operacion(){
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        float num = numero.nextFloat();
        
        for(int i=1; i<=num; i++){
            num=num+i;
            System.out.println("La suma es:"+num);
        }
    }
    
}
