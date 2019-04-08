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
public class Ejercicio24 {
    public void operacion(){
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un numero real: ");
        float numero = num.nextFloat();
        
        if (numero<0){
            System.out.println("El numero ingresado es negativo. ");
        } else{
            if(numero>0){
                System.out.println("El numero ingresado es positivo. ");
            }
        }
    }
    
    
}
