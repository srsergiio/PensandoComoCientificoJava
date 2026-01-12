package com.pensando.capitulo05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio5_LogicaTest {

    @Test
    public void testEsDivisible() {
        Ejercicio5_Logica logica = new Ejercicio5_Logica();
        assertTrue(logica.esDivisible(10, 2), "10 debería ser divisible por 2");
        assertFalse(logica.esDivisible(10, 3), "10 NO debería ser divisible por 3");
    }

    @Test
    public void testEsTriangulo() {
        Ejercicio5_Logica logica = new Ejercicio5_Logica();
        // Caso imposible: un lado (12) es mayor que la suma de los otros (1+1)
        assertFalse(logica.esTriangulo(1, 1, 12), "1, 1 y 12 NO pueden formar un triángulo");

        // Caso posible: triángulo equilátero
        assertTrue(logica.esTriangulo(10, 10, 10), "10, 10 y 10 SÍ pueden formar un triángulo");

        // Caso límite: la suma es igual al tercer lado (tampoco forma triángulo, es una línea)
        // El libro dice "Si es MAYOR que la suma...". Si es igual, técnicamente es un triángulo degenerado,
        // pero asumiremos la definición estricta del ejercicio.
    }
}