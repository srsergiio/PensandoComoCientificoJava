package com.pensando.capitulo05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio5_RecursionTest {

    @Test
    public void testPotencia() {
        Ejercicio5_Recursion rec = new Ejercicio5_Recursion();
        assertEquals(8.0, rec.potencia(2.0, 3), 0.0001, "2^3 debe ser 8");
        assertEquals(1.0, rec.potencia(5.0, 0), 0.0001, "Cualquier número a la 0 es 1");
    }

    @Test
    public void testAckermann() {
        Ejercicio5_Recursion rec = new Ejercicio5_Recursion();
        // A(0, n) = n + 1 -> A(0, 3) = 4
        assertEquals(4, rec.ackermann(0, 3));

        // A(3, 2) = 29 (Es un valor conocido, crece rápido)
        // Si tu código funciona, esto pasará. Si tienes StackOverflow, revisa la lógica.
        assertEquals(29, rec.ackermann(3, 2));
    }
}