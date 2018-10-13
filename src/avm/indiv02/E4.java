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
public class E4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración e inicialización de variables
        int numero1;
        int numero2;
                
        //Entrada de datos
        System.out.println("Introduce un número");
        Scanner teclado = new Scanner(System.in);
        numero1 = teclado.nextInt();
        System.out.println("Introduce otro número");
        numero2 = teclado.nextInt();
        
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
