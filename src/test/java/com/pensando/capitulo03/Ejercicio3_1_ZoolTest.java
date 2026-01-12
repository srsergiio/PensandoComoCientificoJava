package com.pensando.capitulo03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio3_1_ZoolTest {

    @Test
    public void testZool() {
        Ejercicio3_1_Zool ejercicio = new Ejercicio3_1_Zool();

        // Llamamos al método con argumentos específicos
        String resultado = ejercicio.zool(11, "Firulais", "Siempreviva");

        // Verificamos que el método haya usado los 3 parámetros en la respuesta
        // Nota: Asegúrate de respetar el formato que elijas en tu implementación (espacios, comas, etc.)
        // Aquí asumimos un formato estándar para el test:
        String esperado = "Numero: 11, Mascota: Firulais, Calle: Siempreviva";

        assertEquals(esperado, resultado, "El método zool no concatenó correctamente los parámetros.");
    }
}