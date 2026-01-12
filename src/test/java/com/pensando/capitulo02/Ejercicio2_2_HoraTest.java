package com.pensando.capitulo02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio2_2_HoraTest {

    @Test
    public void testCalculosDeHora() {
        // Caso de prueba: 14:30:00 (2:30 PM)
        Ejercicio2_2_Hora reloj = new Ejercicio2_2_Hora(14, 30, 0);

        // Verificación 1: Segundos desde medianoche
        // Esperado: (14 * 3600) + (30 * 60) = 52200
        assertEquals(52200, reloj.calcularSegundosDesdeMedianoche(),
                "Cálculo de segundos desde medianoche incorrecto.");

        // Verificación 2: Segundos restantes
        // Esperado: 86400 - 52200 = 34200
        assertEquals(34200, reloj.calcularSegundosRestantes(),
                "Cálculo de segundos restantes incorrecto.");

        // Verificación 3: Porcentaje del día
        // Esperado: 52200 / 86400 = 0.60416... -> 60.41%
        // El tercer parámetro (0.01) es el margen de error permitido para decimales
        assertEquals(60.41, reloj.calcularPorcentajeDelDia(), 0.01,
                "Porcentaje incorrecto. ¿Usaste división entera (int) en lugar de decimal (double)?");
    }
}