package com.pensando.capitulo08;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;

public class MatematicasGrandesTest {

    @Test
    public void testPotencia() {
        MatematicasGrandes mat = new MatematicasGrandes();

        // Caso pequeño: 2^3 = 8
        assertEquals(BigInteger.valueOf(8), mat.potencia(2, 3));

        // Caso grande: 2^30 (supera el rango de int si fuera factorial grande,
        // pero probaremos algo que sabemos manejar: 10^20)
        // 10^20 tiene 21 dígitos, no cabe en un long normal (max 19 dígitos).

        BigInteger base = BigInteger.valueOf(10);
        BigInteger esperado = new BigInteger("100000000000000000000"); // 1 seguido de 20 ceros

        assertEquals(esperado, mat.potencia(10, 20), "Debe manejar números muy grandes");
    }
}