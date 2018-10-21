/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.indiv02;

/**
 *
 * @author Usuario
 */
public class E07 {
    public static void main(String[] args) {
        /*Programa que escribe en pantalla los números pares que hay entre el
        56 y el 97
        */
        
        //Declaración e inicialización de variables
        int contador;
                        
        //Procesamiento de datos
        /* Utilizamos un Bucle tipo for para controlar las veces que tiene que
        repetirse la imprsión del número en pantalla y anidamos un bucle
        condicional tipo if para que evalúe si el número es par o no
        */        
        for (contador = 56; contador <= 97; contador++) {                    
            if(contador%2 == 0) {
                System.out.print(contador + ", ");
            }
        }
    }
}