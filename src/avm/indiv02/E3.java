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
public class E3 {
  
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
