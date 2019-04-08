/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.Ciclos;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Ejercicio44 {
    public void operacion () {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número para hallar el factorial: ");
        int numero = entrada.nextInt();
        int num = numero;
        int fact = 1;
        if (num<0) {
            fact=0;
        }
        else {
            if (num==0) {
                fact=1;
            }
        }
        while ( num!=0) {
            fact*=num;
            num--;
        }
        System.out.println("El factorial de " + numero + " es: " + fact);
    }
}
