package com.pensando.capitulo09;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HoraTest {

    @Test
    public void testConstructorYToString() {
        // Probamos que el constructor guarde bien los datos
        Hora reloj = new Hora(11, 8, 3.5);

        // Verificamos formato básico (dependerá de cómo implementes el toString)
        // Aceptamos que el toString devuelva "11:8:3.5" o "11:08:03.5"
        String texto = reloj.toString();

        assertNotNull(texto);
        assertTrue(texto.contains("11"), "Debe contener la hora");
        assertTrue(texto.contains("8"), "Debe contener el minuto");
        assertTrue(texto.contains("3.5"), "Debe contener el segundo");
    }

    @Test
    public void testEquals() {
        Hora h1 = new Hora(9, 0, 0.0);
        Hora h2 = new Hora(9, 0, 0.0);
        Hora h3 = new Hora(10, 0, 0.0);

        // h1 y h2 son objetos distintos en memoria, pero sus datos son iguales
        assertTrue(h1.equals(h2), "Dos horas con los mismos datos deben ser iguales");
        assertFalse(h1.equals(h3), "Horas distintas deben retornar false");
    }

    @Test
    public void testIncrementar() {
        Hora reloj = new Hora(10, 59, 59.0);

        // Sumamos 1.5 segundos
        // Esperado: 10:59:60.5 -> Ajuste -> 11:00:00.5
        reloj.incrementar(1.5);

        assertEquals(11, reloj.getHora(), "La hora debería haber cambiado a 11");
        assertEquals(0, reloj.getMinuto(), "El minuto debería ser 0");
        assertEquals(0.5, reloj.getSegundo(), 0.001, "El segundo debería ser 0.5");

        // Prueba de desborde grande: Sumar 3661 segundos (1 hora, 1 min, 1 seg) a las 1:00:00
        reloj = new Hora(1, 0, 0.0);
        reloj.incrementar(3661.0); // Debería ser 2:01:01

        assertEquals(2, reloj.getHora());
        assertEquals(1, reloj.getMinuto());
        assertEquals(1.0, reloj.getSegundo(), 0.001);
    }
}