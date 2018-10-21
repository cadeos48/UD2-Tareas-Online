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
public class E09 {
    public static void main(String[] args) {
        /*Programa que muestra en pantalla la tabla de multiplicar de un número
        introducido por teclado
        */
        
        //Declaración e inicialización de variables
        int numero, multiplicacion;
        int contador;
        String contestacion = " ";
        boolean validacion = false;
        Scanner teclado = new Scanner(System.in);
        
        do {
            try {
                //Introducción de datos
                System.out.println("Introduce un número");
                numero = teclado.nextInt();
                validacion = true;
                //Procesamiento de datos
                
                for (contador = 1; contador <= 10; contador++) {
                    multiplicacion = contador * numero;
                    System.out.println(numero + " X " +contador +" = " +multiplicacion);
                }
                System.out.print("Si qieres obtener otra tabla de multiplicar");
                System.out.println(" teclea la s minúscula");
                contestacion = teclado.next();
            }
            catch (Exception e) {
                System.out.println("Dato erroneo");
                teclado.nextLine();
                }
        }
        while(contestacion.equals("s") || validacion == false);
    }
}