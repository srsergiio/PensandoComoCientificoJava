package com.pensando.capitulo05;

/**
 * Ejercicios de Recursión con retorno de valores.
 */
public class Ejercicio5_Recursion {

    /**
     * Ejercicio 5.10: Calcular potencia de forma recursiva.
     * x^n = x * x^(n-1)
     * Caso base: x^0 = 1
     */
    public double potencia(double x, int n) {
        // TODO:
        // Si n es 0, retornar 1.0
        // Si n > 0, retornar x * potencia(x, n-1)
        return 0.0;
    }

    /**
     * Ejercicio 5.7: Función de Ackermann.
     * Se define como:
     * A(m, n) = n + 1               si m = 0
     * A(m, n) = A(m-1, 1)           si m > 0 y n = 0
     * A(m, n) = A(m-1, A(m, n-1))   si m > 0 y n > 0
     * * ADVERTENCIA: Probar solo con números muy pequeños (m < 4).
     */
    public int ackermann(int m, int n) {
        // TODO: Implementar la lógica con if/else if basándose en la definición matemática.
        return 0;
    }
}