package com.java.retos.ejemplos;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 *  Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 *  NO hace falta comprobar que ambas palabras existan.
 *  Dos palabras exactamente iguales no son anagrama.
 */

import java.util.*;

public class Anagrama {
    public static void main(String[] args) {
        System.out.println(esAnagrama("tomate", "temato"));
    }

    private static Boolean esAnagrama(String primerPalabra, String segundaPalabra){
        if (primerPalabra.toLowerCase() == segundaPalabra.toLowerCase()){
            return false;
        }
        if (primerPalabra.length() != segundaPalabra.length()){
            return false;
        }

        Map<Character, Integer> frecuencia = new HashMap<>();

        for (char letra: primerPalabra.toCharArray()){
            frecuencia.put(letra, frecuencia.getOrDefault(letra, 0) +1);
        }
        for (char letra: segundaPalabra.toCharArray()){
            if (!frecuencia.containsKey(letra)){
                return false;
            }
            frecuencia.put(letra, frecuencia.get(letra) - 1);

            if (frecuencia.get(letra) == 0){
                frecuencia.remove(letra);
            }

        }

        return frecuencia.isEmpty();
    }
}
