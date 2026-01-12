package com.pensando.capitulo06;

public class CalculadoraIterativa {

    /**
     * Ejercicio 6.3: Raíz Cuadrada (Método de Newton).
     * Fórmula: x1 = (x0 + a/x0) / 2
     * Iterar hasta que la diferencia entre x0 y x1 sea menor a 0.0001.
     */
    public double raizCuadrada(double a) {
        // TODO:
        // 1. Inicializar x0 (aproximación inicial), ej: a/2.
        // 2. Usar un bucle while.
        // 3. Calcular x1 con la fórmula.
        // 4. Verificar la diferencia: Math.abs(x1 - x0).
        // 5. Si es menor a 0.0001, terminar y devolver x1.
        // 6. Si no, actualizar x0 = x1 y repetir.
        return 0.0;
    }

    /**
     * Ejercicio 6.4: Potencia Iterativa.
     * Calcular x elevado a la n usando un bucle.
     */
    public double potencia(double x, int n) {
        // TODO:
        // 1. Inicializar resultado = 1.0.
        // 2. Bucle que se repita n veces.
        // 3. En cada vuelta: resultado = resultado * x.
        // 4. Retornar resultado.
        return 0.0;
    }

    /**
     * Ejercicio 6.5: Factorial Iterativo.
     * Calcular n! usando un bucle en lugar de recursión.
     */
    public int factorial(int n) {
        // TODO:
        // 1. Inicializar resultado = 1.
        // 2. Bucle desde i=1 hasta n.
        // 3. resultado = resultado * i.
        return 0;
    }

    /**
     * Ejercicio 6.6: Serie de Taylor para e^x.
     * e^x = 1 + x + x^2/2! + x^3/3! + ...
     * Sumar los primeros n términos.
     */
    public double miExp(double x, int n) {
        // TODO:
        // 1. Inicializar suma = 1.0 (el primer término).
        // 2. Bucle para sumar los siguientes términos.
        // Pista: Puedes reutilizar tus métodos potencia() y factorial() aquí,
        // o hacerlo todo en un bucle para más eficiencia (el término i se basa en el i-1).
        return 0.0;
    }
}