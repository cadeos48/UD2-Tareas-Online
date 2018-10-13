/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.indiv02;

import java.util.Scanner;

public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración e inicialización de variables
        int numero = 0;
        String evaluacion = "";
        
        //Entrada de datos
        System.out.println("Introduce un número");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        
        //Procesamiento de datos
        //Utilizamos una estructura condicional if/else anidada ya que tenemos
        //tres casos posibles
        if (numero > 0) {
            evaluacion = "positvo";
           //Es necesario introducir else ya que si anidásemos un segundo if
           // tras el primero sin else, seguiría ejecutando la estructura
           // if anidada. Así sí se introdujera un número positivo se
           //cumpliría la condición y seguiría ejecutando la siguiente 
           // instrucción: if (numero <= 0), al evaluarse como "false" se
           // ejecutaría  el else anidado: evaluación = "es el número cero", 
           // y daría a la variable evaluacion ese valor en vez de "positivo"
        } else {
            if (numero < 0) {
                evaluacion = "negativo";
            } else {
                evaluacion = "es el número cero";
            }
        }
      
        //Salida de datos
        System.out.println ("el numero: " + numero +" es " +evaluacion);
    }
}
