package com.pensando.capitulo13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplejoTest {

    @Test
    public void testAbs() {
        // Un complejo 3 + 4i tiene módulo 5 (Pitágoras)
        Complejo c = new Complejo(3.0, 4.0);
        assertEquals(5.0, c.abs(), 0.0001, "El valor absoluto de 3+4i debe ser 5");
    }

    @Test
    public void testSuma() {
        Complejo a = new Complejo(1.0, 2.0);
        Complejo b = new Complejo(3.0, 4.0);

        // (1+2i) + (3+4i) = 4+6i
        Complejo resultado = a.sumar(b);

        assertEquals(4.0, resultado.getReal(), "Parte real incorrecta");
        assertEquals(6.0, resultado.getImag(), "Parte imag incorrecta");

        // Verificar que 'a' y 'b' no cambiaron (inmutabilidad)
        assertEquals(1.0, a.getReal());
    }

    @Test
    public void testEquals() {
        Complejo c1 = new Complejo(1, 1);
        Complejo c2 = new Complejo(1, 1);
        assertTrue(c1.equals(c2), "Deben ser iguales");
    }
}