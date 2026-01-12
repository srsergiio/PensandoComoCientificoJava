package com.pensando.capitulo04;

/**
 * Ejercicio 4.5: Teorema de Fermat.
 * Objetivo: Validar la ecuación a^n + b^n = c^n.
 */
public class Ejercicio4_5_Fermat {

    /**
     * Calcula la potencia de un número entero.
     * El libro sugiere escribir esto como método auxiliar.
     */
    public int elevarAPotencia(int base, int exponente) {
        // TODO: Calcular base elevado a exponente. 
        // Puedes usar Math.pow(base, exponente) pero recuerda que devuelve double,
        // así que tendrás que convertirlo a (int).
        return 0;
    }

    /**
     * Verifica si se cumple el teorema de Fermat.
     * Devuelve un mensaje indicando el resultado.
     */
    public String chequearFermat(int a, int b, int c, int n) {
        // TODO:
        // 1. Calcular a^n, b^n y c^n usando el método elevarAPotencia.
        // 2. Verificar si (n > 2) Y (an + bn == cn).
        // 3. Si eso es TRUE -> Retornar "¡Recórcholis, Fermat estaba equivocado!"
        // 4. Si es FALSE -> Retornar "No, eso no funciona."

        return null;
    }
}