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
public class E8 {
    public static void main(String[] args) {
        /*Programa que muestra en pantalla la tabla de multiplicar de un número
        introducido por teclado
        */
        
        //Declaración e inicialización de variables
        int numero, multiplicacion;
        int contador = 1;
        Scanner teclado = new Scanner(System.in);
                
        //Introducción de datos
        System.out.println("Introduce un número");
        numero = teclado.nextInt();
        
        //Procesamiento de datos
        /* Utilizamos un Bucle tipo for para controlar las veces que tiene que
        repetirse la imprsión del número en pantalla y anidamos un bucle
        condicional tipo if para que evalúe si el número es par o no
        */        
        do {
            multiplicacion = contador * numero;
            System.out.println(numero + " X " +contador +" = " +multiplicacion);
            contador++;
        }
        while (contador <=10);
    }
}
            