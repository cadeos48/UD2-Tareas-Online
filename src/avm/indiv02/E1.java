
package avm.indiv02;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        int numero = 0;
        String signo = "";
        
        // Entrada de datos
        System.out.println("Introduce un número");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        
        // Procesamiento de datos
        if (numero < 0 )
            signo = "negativo";
        else
            signo = "positivo";
        
        // Salida de datos
        System.out.println ("El número introducido es:  " + signo );
    }
}