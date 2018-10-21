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
public class E08 {
    public static void main(String[] args) {
        /*Programa que muestra en pantalla la tabla de multiplicar de un número
        introducido por teclado
        */
        
        //Declaración e inicialización de variables
        int numero = 0, multiplicacion;
        int contador;
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
        /* Utilizamos un Bucle tipo for ya que conocemos las veces que se va
        a repetir el bucle: de 1 hasta 10.
        */        
        for (contador = 1; contador <=10; contador++) {
            multiplicacion = contador * numero;
            System.out.println(numero + " X " +contador +" = " +multiplicacion);
        }
    }
}