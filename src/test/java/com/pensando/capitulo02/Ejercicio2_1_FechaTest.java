package com.pensando.capitulo02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio2_1_FechaTest {

    @Test
    public void testFormatosFecha() {
        // Configuración de prueba: Usamos la fecha del ejemplo del libro o una actual
        // Datos: Lunes, 22, Julio, 2026
        Ejercicio2_1_Fecha fecha = new Ejercicio2_1_Fecha("Lunes", 22, "Julio", 2026);

        // 1. Verificamos formato Argentino: "diaSemana diaMes de mes de anio"
        assertEquals("Lunes 22 de Julio de 2026", fecha.obtenerFormatoArgentino(),
                "El formato argentino no es correcto. Revisa los espacios y palabras 'de'.");

        // 2. Verificamos formato Americano: "diaSemana, mes diaMes, anio"
        assertEquals("Lunes, Julio 22, 2026", fecha.obtenerFormatoAmericano(),
                "El formato americano no es correcto. Revisa las comas.");

        // 3. Verificamos formato Europeo: "diaSemana diaMes mes, anio"
        assertEquals("Lunes 22 Julio, 2026", fecha.obtenerFormatoEuropeo(),
                "El formato europeo no es correcto.");
    }
}