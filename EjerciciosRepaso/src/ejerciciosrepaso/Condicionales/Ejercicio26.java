/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.Condicionales;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Ejercicio26 {
    public void operacion () {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese su número: ");
      int numero=entrada.nextInt();
      if (numero % 2 == 0) {
            System.out.println(numero + " es par.");
      }
      else {
            System.out.println(numero + " es impar.");
      }
    }
}
