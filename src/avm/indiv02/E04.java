package avm.indiv02;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class E04 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Programa que devuelve el resultado de una operación que se selecciona
        en función de los números introducidos por el usuario. Se utiliza una
        estructura condicional anidada para realizar la selección de la operación
        a realizar.
        */
        
        //Declaración e inicialización de variables
        int numero1 = 0;
        int numero2 = 0;
        boolean validacion = false;
        Scanner teclado = new Scanner(System.in);
                
       //Entrada de datos
        do {
            try {
                System.out.println("Introduce un número");
                numero1 = teclado.nextInt();
                System.out.println("Introduce otro número");
                numero2 = teclado.nextInt();
                validacion = true;
            }
            catch (Exception e) {
                System.out.println("Dato erroneo. Vuelve a introducir los números");
                teclado.nextLine();//borrar memoria enter+letra
                }
        }
        while (validacion == false);
        
        //Procesamiento de datos
        //Utilizamos una estructura condicional if/else anidada ya que tenemos
        //tres casos posibles
        if (numero1 > numero2) {
            int resta;
            resta = numero1 - numero2;
            System.out.println("La resta de " +numero1 + " y " +numero2 + " es: " +resta);            
        } else {
            if (numero1 < numero2) {
                int suma;
                suma = numero1 + numero2;
                System.out.println("La suma de " +numero1 + " y " +numero2 + " es: " +suma);               
            } else {
                int producto;
                producto = numero1 * numero2;
                System.out.println("El producto de " +numero1 + " y " +numero2 + " es: " +producto);
            }
        }      
    }
}