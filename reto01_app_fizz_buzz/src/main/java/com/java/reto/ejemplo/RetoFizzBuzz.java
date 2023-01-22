package com.java.reto.ejemplo;

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

public class RetoFizzBuzz {
    public static void main(String[] args) {

        for (int indice=1; indice<=100; indice++){

            var divisiblePorTres = indice%3==0;
            var divisiblePorCinco = indice%5==0;

            if (divisiblePorTres && divisiblePorCinco){
                System.out.println(indice + "- fizzbuzz");
            } else if (divisiblePorTres) {
                System.out.println(indice + "- fizz");
            } else if (divisiblePorCinco) {
                System.out.println(indice + "- buzz");
            } else {
                System.out.println(indice);
            }
        }


    }
}
