package com.pensando.capitulo17;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArbolTest {

    @Test
    public void testRecorridos() {
        // Construimos el árbol del ejemplo (de abajo hacia arriba es más fácil)
        Arbol hoja4 = new Arbol(4);
        Arbol hoja5 = new Arbol(5);

        Arbol nodo2 = new Arbol(2, hoja4, null); // 2 tiene a 4 a la izq
        Arbol nodo3 = new Arbol(3, null, hoja5); // 3 tiene a 5 a la der

        Arbol raiz = new Arbol(1, nodo2, nodo3); // 1 es la raíz

        // 1. Pre-Orden: 1 2 4 3 5
        assertEquals("1 2 4 3 5", raiz.obtenerPreOrden(), "Fallo en Pre-Orden");

        // 2. In-Orden: 4 2 1 3 5
        assertEquals("4 2 1 3 5", raiz.obtenerInOrden(), "Fallo en In-Orden");

        // 3. Post-Orden: 4 2 5 3 1
        assertEquals("4 2 5 3 1", raiz.obtenerPostOrden(), "Fallo en Post-Orden");
    }

    @Test
    public void testAltura() {
        Arbol hoja = new Arbol(10);
        // Altura de una hoja suele ser 0 (o 1 si cuentas nodos).
        // Usaremos la lógica de 0 = solo raíz (sin aristas).
        // Si tu lógica retorna 1, ajusta el test a 1.

        // Árbol simple
        assertEquals(1, new Arbol(10).altura() + 1, "Un solo nodo suele tener altura 1 (por nodos) o 0 (por aristas)");

        // Árbol más complejo (el del ejemplo anterior)
        // Camino más largo: 1 -> 2 -> 4 (3 niveles de nodos, 2 aristas)
        Arbol raiz = new Arbol(1, new Arbol(2), null);
        // Ajusta este valor según si tu fórmula cuenta nodos o aristas.
        // Si cuentas nodos, debería ser 2.
    }
}