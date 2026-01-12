package com.pensando.capitulo05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio5_4_DistanciaTest {

    @Test
    public void testDistancia() {
        Ejercicio5_4_Distancia ejercicio = new Ejercicio5_4_Distancia();

        // Distancia entre (1,2) y (4,6)
        // dx = 3, dy = 4. Triángulo 3-4-5. Distancia debe ser 5.
        double resultado = ejercicio.distancia(1.0, 2.0, 4.0, 6.0);

        assertEquals(5.0, resultado, 0.0001, "La distancia calculada es incorrecta");
    }
}