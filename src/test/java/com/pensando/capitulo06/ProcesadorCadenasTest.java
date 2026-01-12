package com.pensando.capitulo06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProcesadorCadenasTest {

    @Test
    public void testBalanceParentesis() {
        ProcesadorCadenas procesador = new ProcesadorCadenas();

        // Caso balanceado: ((3+7)*2) -> sube 2, baja 2 = 0
        assertEquals(0, procesador.contarBalanceParentesis("((3+7)*2)"));

        // Caso desbalanceado positivo: (( -> 2
        assertEquals(2, procesador.contarBalanceParentesis("(("));

        // Caso desbalanceado negativo: )) -> -2
        assertEquals(-2, procesador.contarBalanceParentesis("))"));

        // Sin paréntesis
        assertEquals(0, procesador.contarBalanceParentesis("Hola Mundo"));
    }
}