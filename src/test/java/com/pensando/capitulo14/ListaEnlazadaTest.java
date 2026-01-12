package com.pensando.capitulo14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaEnlazadaTest {

    @Test
    public void testAgregarAlPrincipio() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregarAlPrincipio(10); // Lista: (10)
        lista.agregarAlPrincipio(20); // Lista: (20, 10)

        assertEquals("(20, 10)", lista.toString());
        assertEquals(2, lista.tamano());
    }

    @Test
    public void testAgregarAlFinal() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregarAlFinal(1); // (1)
        lista.agregarAlFinal(2); // (1, 2)
        lista.agregarAlFinal(3); // (1, 2, 3)

        assertEquals("(1, 2, 3)", lista.toString());
        assertEquals(3, lista.tamano());
    }

    @Test
    public void testEliminarPrimero() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregarAlFinal(5);
        lista.agregarAlFinal(10);

        // Eliminamos el 5
        int eliminado = lista.eliminarPrimero();
        assertEquals(5, eliminado);
        assertEquals("(10)", lista.toString());

        // Eliminamos el 10
        eliminado = lista.eliminarPrimero();
        assertEquals(10, eliminado);
        assertEquals("()", lista.toString()); // Queda vacía
    }
}