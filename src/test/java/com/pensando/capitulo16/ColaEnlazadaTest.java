package com.pensando.capitulo16;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColaEnlazadaTest {

    @Test
    public void testColaBasica() {
        ColaEnlazada cola = new ColaEnlazada();
        assertTrue(cola.estaVacia());

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        assertEquals(3, cola.tamano());

        // FIFO: El primero que entró (10) debe ser el primero en salir
        assertEquals(10, cola.desencolar());
        assertEquals(20, cola.desencolar());
        assertEquals(30, cola.desencolar());

        assertTrue(cola.estaVacia());
        assertEquals(-1, cola.desencolar()); // Manejo de vacío
    }
}