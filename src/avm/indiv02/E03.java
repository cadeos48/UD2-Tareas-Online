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
public class E03 {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Programa que compara dos números introducidos por teclado y muestra en
        pantalla cual es el mayor o si son iguales
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
            System.out.println("El número mayor es: " +numero1 );            
        } else {
            if (numero1 < numero2) {
                System.out.println("El número mayor es: " +numero2 );               
            } else {
                 System.out.println("los dos números son iguales");
            }
        }      
    }
}
