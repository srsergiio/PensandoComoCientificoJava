package com.pensando.capitulo03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio3_2_ImpresoraFechaTest {

    @Test
    public void testFormatosConParametros() {
        Ejercicio3_2_ImpresoraFecha impresora = new Ejercicio3_2_ImpresoraFecha();

        // Probamos con una fecha
        String americano = impresora.imprimirAmericano("Sabado", 22, "Julio", 2015);
        assertEquals("Sabado, Julio 22, 2015", americano, "Fallo en formato americano");

        // Probamos con OTRA fecha distinta para asegurar que no están 'hardcodeados' los valores
        String europeo = impresora.imprimirEuropeo("Domingo", 1, "Enero", 2024);
        assertEquals("Domingo 1 Enero 2024", europeo, "Fallo en formato europeo");
    }
}