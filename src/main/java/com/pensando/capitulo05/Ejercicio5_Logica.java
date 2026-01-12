package com.pensando.capitulo05;

/**
 * Ejercicios 5.1 y 5.2: Métodos booleanos.
 * Objetivo: Escribir métodos que devuelvan true o false según una condición.
 */
public class Ejercicio5_Logica {

    /**
     * Ejercicio 5.2: Verifica si n es divisible por m.
     * @return true si n es divisible por m, false en caso contrario.
     */
    public boolean esDivisible(int n, int m) {
        // TODO: Retornar true si el resto de dividir n por m es 0.
        // Pista: usar el operador módulo (%)
        return false;
    }

    /**
     * Ejercicio 5.1: Verifica si tres longitudes pueden formar un triángulo.
     * Regla: Si alguna de las tres longitudes es mayor que la suma de las otras dos,
     * NO se puede formar un triángulo. En otro caso, sí.
     * * @param a Longitud del lado 1
     * @param b Longitud del lado 2
     * @param c Longitud del lado 3
     * @return true si se puede formar un triángulo.
     */
    public boolean esTriangulo(int a, int b, int c) {
        // TODO: Verificar la regla del triángulo.
        // Si (a > b + c) O (b > a + c) O (c > a + b) -> Entonces es falso.
        // Sino -> es verdadero.
        return false;
    }
}