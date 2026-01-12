package com.pensando.capitulo15;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Ejercicios del Capítulo 15: Pilas.
 * Objetivo: Usar el TAD Pila (Stack) para resolver problemas de inversión y balanceo.
 */
public class EjerciciosPilas {

    /**
     * Ejercicio 15.1: Reverso.
     * Invierte el orden de un arreglo usando una Pila.
     * @param arreglo El arreglo de enteros a invertir.
     * @return Un nuevo arreglo con los elementos en orden inverso.
     */
    public int[] reverso(int[] arreglo) {
        // TODO:
        // 1. Crear una Stack<Integer> pila = new Stack<>();
        // 2. Recorrer el arreglo y hacer pila.push(elemento) para cada uno.
        // 3. Crear un nuevo arreglo resultado del mismo tamaño.
        // 4. Recorrer el nuevo arreglo y llenarlo haciendo pila.pop().
        //    (Como la pila devuelve el último que entró, el arreglo quedará invertido).
        return null;
    }

    /**
     * Ejercicio 15.4: Balanceo de paréntesis.
     * Verifica si una cadena tiene los paréntesis (), corchetes [] y llaves {}
     * correctamente balanceados y anidados.
     * Ej: "{([])}" -> true, "([)]" -> false, "(((" -> false
     */
    public boolean estaBalanceado(String s) {
        // TODO:
        // 1. Crear una Stack<Character> pila.
        // 2. Recorrer el String caracter por caracter.
        // 3. Si es apertura '(', '[', '{' -> push a la pila.
        // 4. Si es cierre ')', ']', '}':
        //    a. Si la pila está vacía -> return false (cierre sin apertura previa).
        //    b. Hacer char tope = pila.pop().
        //    c. Verificar si 'tope' es la pareja correcta del cierre actual.
        //       (Ej: si cierre es ')' tope debe ser '('). Si no coinciden -> return false.
        // 5. Al final, return pila.isEmpty() (si quedó algo, faltó cerrar).
        return false;
    }

    /**
     * Ejercicio 15.5: Evaluador Postfijo (Notación Polaca Inversa).
     * Evalúa expresiones donde el operador va después de los operandos.
     * Ej: "1 2 +" equivale a "1 + 2" -> 3.
     * Ej: "1 2 3 * +" equivale a "1 + (2 * 3)" -> 7.
     * Soporta operadores: +, -, *, /
     */
    public double evaluarPostfijo(String expresion) {
        Stack<Double> pila = new Stack<>();
        // Usamos StringTokenizer para separar por espacios (tokens)
        StringTokenizer tokens = new StringTokenizer(expresion);

        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();

            // TODO:
            // 1. Verificar si 'token' es un operador (+, -, *, /).
            //    a. Si ES operador:
            //       - Hacer val2 = pila.pop().
            //       - Hacer val1 = pila.pop().
            //       - Calcular resultado (val1 op val2). ¡Ojo el orden en resta/división!
            //       - Hacer pila.push(resultado).
            //    b. Si NO es operador (es un número):
            //       - Convertir a double (Double.parseDouble(token)).
            //       - Hacer pila.push(valor).
        }

        // Al final, el resultado es el único elemento que queda en la pila.
        // return pila.pop();
        return 0.0;
    }
}