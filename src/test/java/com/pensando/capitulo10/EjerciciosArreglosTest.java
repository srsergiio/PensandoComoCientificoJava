package com.pensando.capitulo10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EjerciciosArreglosTest {

    EjerciciosArreglos ejercicios = new EjerciciosArreglos();

    @Test
    public void testSonFactores() {
        // 12 es divisible por 1, 2, 3, 4, 6
        int[] factores = {1, 2, 3, 4, 6};
        assertTrue(ejercicios.sonFactores(12, factores), "Todos deberían ser factores de 12");

        // 12 NO es divisible por 5
        int[] noFactores = {1, 2, 5};
        assertFalse(ejercicios.sonFactores(12, noFactores), "Debería fallar porque 5 no es factor de 12");
    }

    @Test
    public void testBuscar() {
        int[] numeros = {10, 20, 30, 40, 50};

        // Caso: Encontrar valor
        assertEquals(2, ejercicios.buscar(numeros, 30), "El 30 está en el índice 2");

        // Caso: Valor no existe
        assertEquals(-1, ejercicios.buscar(numeros, 99), "El 99 no está, debe devolver -1");

        // Caso: Valor repetido (debe devolver el primero)
        int[] repetidos = {5, 5, 5};
        assertEquals(0, ejercicios.buscar(repetidos, 5), "Debe devolver el primer índice encontrado");
    }

    @Test
    public void testEsRedoblona() {
        // Casos verdaderos
        assertTrue(ejercicios.esRedoblona("mama"), "mama es redoblona");
        assertTrue(ejercicios.esRedoblona("coco"), "coco es redoblona");
        // 'intestines' es un ejemplo clásico en inglés, en español: "reconocer" (no es redoblona perfecta)
        // Probemos una artificial o palíndromo par: "abba"
        assertTrue(ejercicios.esRedoblona("abba"), "abba es redoblona");

        // Casos falsos
        assertFalse(ejercicios.esRedoblona("oso"), "oso falla (s aparece 1 vez)");
        assertFalse(ejercicios.esRedoblona("banana"), "banana falla (a aparece 3 veces)");
    }
}