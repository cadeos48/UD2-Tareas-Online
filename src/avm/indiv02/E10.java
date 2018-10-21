/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.indiv02;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E10 {
      public static void main(String[] args) {
        /*Programa que muestra en pantalla la tabla de multiplicar de un número
        introducido por teclado
        */
        
        //Declaración e inicialización de variables
        int numero = 0, contador;
        boolean validacion = false;
        Scanner teclado = new Scanner(System.in);
                
            //Entrada de datos
         do {
            try {
                System.out.println("Introduce un número");
                numero = teclado.nextInt();                
                validacion = true;
            }
            catch (Exception e) {
                System.out.println("Dato erroneo");
                teclado.nextLine();//borrar memoria enter+letra
                }
        }
        while (validacion == false);
        
        //Procesamiento de datos
        /* Utilizamos un condicional if para valorar si el número introducido por
        el usuario es mayor a 1. Anidamos un bucle for para controlar las 
        veces que debe escribirse en pantalla el divisor, que se mostrará en caso
        de que la división del número entre el contador de como resto cero
        */        
       if (numero > 0) {
           for (contador = numero; contador > 0; contador--) {
               if (numero % contador == 0) {
                   System.out.print(contador + ", ");
               }
           }
       }
       else {
           if (numero < 1) {
           System.out.println("el número introducido no es válido");
           }
       }
      }
 }