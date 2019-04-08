/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.EjerciciosSimples;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Ejercicio14 {
    public void operacion () {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese a: ");
      int a=entrada.nextInt();
      System.out.println("Ingrese b: ");
      int b=entrada.nextInt();
      System.out.println("Ingrese c: ");
      int c=entrada.nextInt();
      int formula = (-b) + (int)sqrt(b*b-4*a*c)/(2*a);
        System.out.println("El resultado de la ecuación es: " + formula);
    }
}
