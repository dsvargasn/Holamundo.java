/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.EjerciciosSimples;

import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class Ejercicio20 {
    public void operacion () {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese su medida en metros: ");
      float a=entrada.nextInt();
      float conversion = (float) (a*39.27);
        System.out.println("El resultado de la ecuación es: " + conversion);
    }
}
