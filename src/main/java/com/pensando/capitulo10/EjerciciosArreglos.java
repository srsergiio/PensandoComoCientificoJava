package com.pensando.capitulo10;

/**
 * Ejercicios del Capítulo 10: Arreglos.
 * Objetivo: Manipular colecciones de datos de tamaño fijo.
 */
public class EjerciciosArreglos {

    /**
     * Ejercicio 10.4: sonFactores
     * Verifica si todos los números en el arreglo 'a' son factores de 'n'.
     * (Es decir, si n es divisible por cada uno de ellos).
     * * @param n El número a verificar.
     * @param a El arreglo de posibles factores.
     * @return true si TODOS son factores, false si alguno falla.
     */
    public boolean sonFactores(int n, int[] a) {
        // TODO:
        // 1. Recorrer el arreglo 'a' usando un bucle for o for-each.
        // 2. Para cada elemento 'val' en 'a':
        //    Si (n % val != 0) -> Retornar false inmediatamente.
        // 3. Si termina el bucle sin retornar false, retornar true.
        return false;
    }

    /**
     * Ejercicio 10.5: buscar (Búsqueda Lineal)
     * Devuelve el índice de la primera aparición de 'objetivo' en el arreglo.
     * * @param a El arreglo donde buscar.
     * @param objetivo El valor a buscar.
     * @return El índice donde se encuentra, o -1 si no está.
     */
    public int buscar(int[] a, int objetivo) {
        // TODO:
        // 1. Recorrer el arreglo desde i=0 hasta a.length.
        // 2. Si a[i] == objetivo -> Retornar i.
        // 3. Si termina el bucle, retornar -1.
        return -1;
    }

    /**
     * Ejercicio 10.12: esRedoblona (Doubloon)
     * Una palabra es "redoblona" si cada letra que aparece en ella,
     * aparece EXACTAMENTE dos veces.
     * Ejemplo: "mama" (m:2, a:2) -> true. "oso" (o:2, s:1) -> false.
     * * Pista: Usar un arreglo de 26 enteros para contar las letras.
     */
    public boolean esRedoblona(String s) {
        // TODO:
        // 1. Convertir la cadena a minúsculas (s.toLowerCase()).
        // 2. Crear un arreglo de contadores: int[] cuentas = new int[26];
        // 3. Recorrer la cadena:
        //    char letra = s.charAt(i);
        //    int indice = letra - 'a'; // Convierte 'a'->0, 'b'->1...
        //    cuentas[indice]++;
        // 4. Recorrer el arreglo de cuentas:
        //    Si cuentas[i] no es 0 Y no es 2 -> Retornar false.
        // 5. Retornar true.
        return false;
    }
}