package com.pensando.capitulo15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EjerciciosPilasTest {

    EjerciciosPilas ejercicios = new EjerciciosPilas();

    @Test
    public void testReverso() {
        int[] original = {1, 2, 3, 4};
        int[] invertido = ejercicios.reverso(original);

        assertArrayEquals(new int[]{4, 3, 2, 1}, invertido, "El arreglo debería estar invertido");
    }

    @Test
    public void testBalanceado() {
        // Casos Válidos
        assertTrue(ejercicios.estaBalanceado("()"), "() simple");
        assertTrue(ejercicios.estaBalanceado("{[()]}"), "Anidado correcto");
        assertTrue(ejercicios.estaBalanceado("a(b)c"), "Con texto entre medio"); // El libro a veces pide ignorar texto

        // Casos Inválidos
        assertFalse(ejercicios.estaBalanceado("("), "Apertura sin cierre");
        assertFalse(ejercicios.estaBalanceado(")"), "Cierre sin apertura");
        assertFalse(ejercicios.estaBalanceado("(]"), "Parejas incorrectas");
        assertFalse(ejercicios.estaBalanceado("([)]"), "Cruce incorrecto (no anidado)");
    }

    @Test
    public void testEvaluarPostfijo() {
        // "1 2 +" -> 1 + 2 = 3.0
        assertEquals(3.0, ejercicios.evaluarPostfijo("1 2 +"), 0.001);

        // "1 2 3 * +" -> 2*3=6, luego 1+6=7
        assertEquals(7.0, ejercicios.evaluarPostfijo("1 2 3 * +"), 0.001);

        // "10 2 /" -> 10 / 2 = 5.0
        // Importante: verificar que haces val1 / val2 y no al revés.
        // En la pila entra 10, luego 2. El pop saca 2 (val2), luego 10 (val1).
        assertEquals(5.0, ejercicios.evaluarPostfijo("10 2 /"), 0.001);
    }
}