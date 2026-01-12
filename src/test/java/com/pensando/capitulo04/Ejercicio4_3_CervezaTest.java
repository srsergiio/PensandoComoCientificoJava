package com.pensando.capitulo04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio4_3_CervezaTest {

    @Test
    public void testEstrofas() {
        Ejercicio4_3_Cerveza ejercicio = new Ejercicio4_3_Cerveza();

        // 1. Probamos una estrofa normal (ej. 99 botellas)
        String estrofa99 = ejercicio.obtenerEstrofa(99);
        assertNotNull(estrofa99, "La estrofa no debe ser nula");
        assertTrue(estrofa99.contains("99 botellas"), "Debe mencionar 99 botellas");
        assertTrue(estrofa99.contains("98 botellas"), "Debe mencionar que quedan 98");

        // 2. Probamos el Caso Base (0 botellas)
        String fin = ejercicio.obtenerEstrofa(0);
        assertTrue(fin.contains("No hay más botellas"), "Debe cantar la estrofa final cuando n=0");
    }
}