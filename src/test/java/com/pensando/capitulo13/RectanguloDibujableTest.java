package com.pensando.capitulo13;

import org.junit.jupiter.api.Test;
import java.awt.Color;
import static org.junit.jupiter.api.Assertions.*;

public class RectanguloDibujableTest {

    @Test
    public void testHerencia() {
        RectanguloDibujable rd = new RectanguloDibujable(10, 20, 50, 30, Color.RED);

        // Verificamos que tiene los métodos de su PADRE (Rectangle)
        assertEquals(50, rd.width, "Debe heredar el ancho de Rectangle");
        assertEquals(10, rd.x, "Debe heredar la posición X de Rectangle");

        // Verificamos que tiene sus propios métodos
        assertEquals(Color.RED, rd.getColor());

        // Probamos el método dibujar
        String dibujo = rd.dibujar();
        assertNotNull(dibujo);
        // Ajusta esto según lo que decidas escribir en tu método dibujar
        // assertTrue(dibujo.contains("rojo") || dibujo.contains("java.awt.Color[r=255"));
    }
}