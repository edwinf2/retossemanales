package com.java.serie.reto02;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 *   La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */


public class SerieFibonacci {
    public static void main(String[] args) {

        SerieFibonacci(50);

    }
    public static void SerieFibonacci(long numero){
        long num0 = 0L;
        long num1 = 1L;

        for (long i = 0; i < numero; i++){
            System.out.println(i + " : " + num0);

            long num2 = num0 + num1;
            num0 = num1;
            num1 = num2;
        }
    }


}
