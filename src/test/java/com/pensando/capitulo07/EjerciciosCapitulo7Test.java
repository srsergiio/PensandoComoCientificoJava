package com.pensando.capitulo07;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EjerciciosCapitulo7Test {

    EjerciciosCapitulo7 ejercicios = new EjerciciosCapitulo7();

    @Test
    public void testMedio() {
        assertEquals("anan", ejercicios.medio("banana"));
        assertEquals("ol", ejercicios.medio("Hola"));
        assertEquals("", ejercicios.medio("A")); // Caso borde: 1 letra
        assertEquals("", ejercicios.medio(""));  // Caso borde: vacía
    }

    @Test
    public void testEsCapicua() {
        assertTrue(ejercicios.esCapicua("neuquen"), "neuquen debería ser capicúa");
        assertTrue(ejercicios.esCapicua("reconocer"), "reconocer debería ser capicúa");
        assertTrue(ejercicios.esCapicua("a"), "una letra es capicúa");
        assertFalse(ejercicios.esCapicua("java"), "java NO es capicúa");
    }

    @Test
    public void testEsAbecedaria() {
        assertTrue(ejercicios.esAbecedaria("amor"), "'amor' está en orden alfabético");
        assertTrue(ejercicios.esAbecedaria("himno"), "'himno' está en orden alfabético");
        assertFalse(ejercicios.esAbecedaria("zebra"), "'zebra' NO está en orden ('e' va antes que 'z')");
    }

    @Test
    public void testCifradoCesar() {
        // Rotación 13 (ROT13) es estándar. 'a' + 13 = 'n'
        assertEquals("n", ejercicios.cifrarCesar("a", 13));
        // 'n' + 13 = 'a' (da la vuelta)
        assertEquals("a", ejercicios.cifrarCesar("n", 13));
        // "abc" + 1 -> "bcd"
        assertEquals("bcd", ejercicios.cifrarCesar("abc", 1));
        // Prueba completa (el libro usa "melón" -> "zryba" aprox, pero usaremos sin acentos)
        // "melon" + 13 = "zryba"
        assertEquals("zryba", ejercicios.cifrarCesar("melon", 13));
    }
}