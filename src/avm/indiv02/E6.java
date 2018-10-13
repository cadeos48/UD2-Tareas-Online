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
public class E6 {
    /* @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración e inicialización de variables
        int numero = 0;
                
        //Procesamiento de datos
        //Utilizamos una estructura repetitiva do-while, ya que la iteración
        //se va a ejecutar al menos una vez
        do {
            System.out.print(numero +", ");            
            numero++;
        }
        while (numero <= 30);
    }
}
