package com.pensando.capitulo18;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonticuloTest {

    @Test
    public void testColaDePrioridad() {
        Monticulo heap = new Monticulo();

        // Agregamos números desordenados
        heap.agregar(10);
        heap.agregar(50); // Este debería subir a la raíz
        heap.agregar(20);
        heap.agregar(5);
        heap.agregar(100); // Ahora este debería ser la raíz

        // Verificamos que salgan en orden descendente
        assertEquals(100, heap.eliminarMax(), "El primero debe ser el máximo (100)");
        assertEquals(50, heap.eliminarMax(), "Sigue el 50");
        assertEquals(20, heap.eliminarMax(), "Sigue el 20");
        assertEquals(10, heap.eliminarMax(), "Sigue el 10");
        assertEquals(5, heap.eliminarMax(), "El último es el 5");

        assertTrue(heap.estaVacio(), "El montículo debe quedar vacío");
    }
}
