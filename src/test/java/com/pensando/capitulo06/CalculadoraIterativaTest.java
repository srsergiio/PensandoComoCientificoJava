package com.pensando.capitulo06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraIterativaTest {

    CalculadoraIterativa calc = new CalculadoraIterativa();

    @Test
    public void testRaizCuadrada() {
        // Raíz de 9 es 3. Aceptamos un pequeño error (delta) de 0.0001
        assertEquals(3.0, calc.raizCuadrada(9.0), 0.0001);
        // Raíz de 2 (aprox 1.4142)
        assertEquals(Math.sqrt(2), calc.raizCuadrada(2.0), 0.0001);
    }

    @Test
    public void testPotencia() {
        assertEquals(8.0, calc.potencia(2.0, 3), 0.0001); // 2^3
        assertEquals(1.0, calc.potencia(5.0, 0), 0.0001); // x^0
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calc.factorial(5)); // 5! = 120
        assertEquals(1, calc.factorial(0));   // 0! = 1
    }

    @Test
    public void testMiExp() {
        // e^1 es aprox 2.71828...
        // Con n=10 términos debería ser muy preciso
        assertEquals(Math.exp(1), calc.miExp(1.0, 10), 0.001);
    }
}