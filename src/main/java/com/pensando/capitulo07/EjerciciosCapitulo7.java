package com.pensando.capitulo07;

/**
 * Ejercicios del Capítulo 7: Cadenas y cosas.
 * Objetivo: Dominar charAt, length, substring, y algoritmos de recorrido.
 */
public class EjerciciosCapitulo7 {

    /**
     * Ejercicio: Método 'medio'.
     * Devuelve una subcadena que contiene todo excepto la primera y la última letra.
     * Ejemplo: "banana" -> "anan"
     * Pista: Usar substring. Cuidado con cadenas de largo < 2.
     */
    public String medio(String s) {
        // TODO:
        // 1. Verificar si el largo es menor a 2. Si es así, retornar cadena vacía "".
        // 2. Retornar s.substring(1, s.length() - 1);
        return null;
    }

    /**
     * Ejercicio 7.5: Palíndromo (Capicúa) - Versión Iterativa.
     * Una palabra es capicúa si se lee igual al derecho y al revés (ej: "neuquen").
     * Implementar usando un bucle while o for, comparando extremos.
     */
    public boolean esCapicua(String s) {
        // TODO:
        // 1. Definir dos índices: izq = 0, der = s.length() - 1.
        // 2. Mientras (izq < der):
        //    a. Si charAt(izq) != charAt(der) -> No es capicúa (return false).
        //    b. Avanzar izq, retroceder der.
        // 3. Si termina el bucle, es capicúa (return true).
        return false;
    }

    /**
     * Ejercicio 7.6: Palabra Abecedaria.
     * Una palabra es abecedaria si sus letras aparecen en orden alfabético.
     * Ejemplo: "amor", "chino", "himno".
     */
    public boolean esAbecedaria(String s) {
        // TODO:
        // 1. Recorrer la cadena desde el índice 1 hasta el final.
        // 2. Comparar el caracter actual con el anterior (i vs i-1).
        // 3. Si (actual < anterior) -> No es abecedaria (return false).
        // 4. Si termina el bucle, es verdadera.
        return false;
    }

    /**
     * Ejercicio 7.9: Cifrado César (Capitán Crunch).
     * Toma una cadena y desplaza cada letra 'n' posiciones en el alfabeto.
     * Ejemplo con n=13: 'a' -> 'n', 'b' -> 'o'. 'z' da la vuelta.
     * NOTA: Asumir solo letras minúsculas para simplificar, o manejar ambos casos.
     */
    public String cifrarCesar(String s, int n) {
        // TODO:
        // 1. Crear una variable resultado (String o StringBuilder).
        // 2. Recorrer cada caracter 'c' de 's'.
        // 3. Calcular nueva posición: char nuevo = (char) (c + n).
        // 4. Manejar el desborde ('z' -> 'a').
        //    Pista matemática: (c - 'a' + n) % 26 + 'a'.
        // 5. Concatenar a resultado.
        return null;
    }
}