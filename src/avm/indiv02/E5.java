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
public class E5 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración e inicialización de variables
        int seleccion;
        Scanner teclado = new Scanner(System.in);
        double numero1,numero2; /*Los defino como double para que se realice
        correctamente la división
        */
                         
        //Entrada de datos
        System.out.println("Introduce una opción");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        seleccion = teclado.nextInt();
        System.out.println("Introduce un número");
        numero1 = teclado.nextInt();
        System.out.println("Introduce otro número");
        numero2 = teclado.nextInt();
        System.out.println();
                               
        //Procesamiento de datos
        //Como conocemos los casos (5 opciones), utilizamos una estructura
        //de control condicional switch
        
        switch (seleccion) {
            case 1:
                double suma;
                suma = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2 + " = " +suma);
                break;
             case 2:
                double resta;
                resta = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2 + " = " +resta);
                break;
             case 3:
                double multiplicacion;
                multiplicacion = numero1 * numero2;
                System.out.println(numero1 + " * " + numero2 + " = " +multiplicacion);
                break;      
             case 4:
                double division;
                division = numero1 / numero2;
                System.out.println(numero1 + " / " + numero2 + " = " +division);
                break;
             case 5:
                break;
             default: 
                System.out.println("Este número no coincide con ninguna de las opciones disponibles");
        }
    }
}