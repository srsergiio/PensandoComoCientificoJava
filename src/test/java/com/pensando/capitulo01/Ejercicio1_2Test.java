package com.pensando.capitulo01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio1_2Test {

    @Test
    public void testHolaMundo() {
        capitulo01 ejercicio = new capitulo01();
        assertEquals("Hola, mundo.", ejercicio.obtenerSaludo());
    }

    @Test
    public void testSegundoMensaje() {
        capitulo01 ejercicio = new capitulo01();
        assertEquals("¿Cómo estás?", ejercicio.obtenerSegundoMensaje());
    }
}