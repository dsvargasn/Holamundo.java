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
public class Ejercicio12 {
    public void operacion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese a: ");
        int a = sc.nextInt();
        Scanner st = new Scanner(System.in);
        System.out.println("Ingrese b: ");
        int b = st.nextInt();
        Scanner sb = new Scanner(System.in);
        System.out.println("Ingrese c: ");
        int c = sb.nextInt();
        
        float ecuacion = (a+7*c)/(b+2-a)+2*b;
        System.out.println("El resultado de la ecuacion (a+7*c)/(b+2-a)+2*b es: " + ecuacion);
    }
    
    
}
