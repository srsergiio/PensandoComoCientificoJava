package com.pensando.capitulo19;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class AnalizadorDeTextoTest {

    @Test
    public void testFrecuencias() {
        AnalizadorDeTexto analizador = new AnalizadorDeTexto();
        String texto = "banana manzana BANANA pera manzana banana";

        // Ejecutamos el conteo
        Map<String, Integer> resultado = analizador.contarPalabras(texto);

        // Verificaciones
        // 1. "banana" aparece 3 veces (2 minúsculas + 1 mayúscula normalizada)
        assertTrue(resultado.containsKey("banana"));
        assertEquals(3, resultado.get("banana"));

        // 2. "manzana" aparece 2 veces
        assertEquals(2, resultado.get("manzana"));

        // 3. "pera" aparece 1 vez
        assertEquals(1, resultado.get("pera"));

        // 4. "kiwi" no debería estar
        assertNull(resultado.get("kiwi")); // o assertFalse(containsKey)
    }
}