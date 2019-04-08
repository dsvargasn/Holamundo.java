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
public class Ejercicio08 {
    public void operacion () {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese a: ");
      int a=entrada.nextInt();
      System.out.println("Ingrese b: ");
      int b=entrada.nextInt();
      int area = a * b / 2;
      System.out.println("El area de un triangulo es: " + area);
    }

    
}
