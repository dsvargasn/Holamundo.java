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
public class Ejercicio32 {
    public void operacion () {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese horas: ");
      int hr=entrada.nextInt();
      System.out.println("Ingrese minutos: ");
      int mn=entrada.nextInt();
      System.out.println("Ingrese segundos: ");
      int sg=entrada.nextInt();
      if (sg<59) {
          sg++;
      }
      else {
          if (sg==60) {
              mn++;
          }
          else {
              if (mn==60) {
                  hr++;
              }
              if (hr>12) {
              hr=1;
              }
          }
      }
      
        System.out.println("La hora +1 seg. es= " + hr + ":" + mn + ":" + sg);
    }
}
