
package avm.indiv02;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*Programa que evalúa mediante una estructura condicional de tipo if
        si un númeo es positivo o negativo, considerando el cero como positivo
        */
        
         // Declaración e inicialización de variables     
        int numero = 0;
        String signo = "";
        boolean validacion = false;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos
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
       
        
        // Procesamiento de datos
        if (numero < 0 )
            signo = "negativo";
        else
            signo = "positivo";
        
        // Salida de datos
        System.out.println ("El número introducido es: " + signo );
    }
}