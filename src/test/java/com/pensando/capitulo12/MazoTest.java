package com.pensando.capitulo12;

import com.pensando.capitulo11.Carta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MazoTest {

    @Test
    public void testMezclar() {
        Mazo mazo = new Mazo();

        // Obtenemos la primera carta antes de mezclar (Debería ser As de Tréboles)
        Carta primeraAntes = mazo.obtenerCarta(0);

        mazo.mezclar();

        // Obtenemos la primera carta después de mezclar
        Carta primeraDespues = mazo.obtenerCarta(0);

        // Existe una probabilidad infinitesimal de que salga la misma,
        // pero asumiremos que si mezclamos bien, no deberían ser iguales en la posición 0.
        // Para ser más rigurosos, podríamos chequear varias posiciones.
        assertFalse(primeraAntes.equals(primeraDespues),
                "Después de mezclar, la primera carta debería cambiar (probablemente).");
    }

    @Test
    public void testOrdenar() {
        Mazo mazo = new Mazo();
        mazo.mezclar(); // Lo desordenamos primero

        mazo.ordenar(); // Lo ordenamos

        // Verificamos:
        // La carta en 0 debe ser la menor (As de Tréboles, palo 0 valor 1)
        Carta primera = mazo.obtenerCarta(0);
        assertEquals("As de Tréboles", primera.toString(), "La primera carta debe ser As de Tréboles");

        // La carta en 51 debe ser la mayor (Rey de Picas, palo 3 valor 13)
        Carta ultima = mazo.obtenerCarta(51);
        assertEquals("Rey de Picas", ultima.toString(), "La última carta debe ser Rey de Picas");

        // Verificación intermedia: la carta en i debe ser menor que la carta en i+1
        for (int i = 0; i < 51; i++) {
            Carta actual = mazo.obtenerCarta(i);
            Carta siguiente = mazo.obtenerCarta(i + 1);
            assertTrue(actual.compararCon(siguiente) <= 0,
                    "El mazo no quedó ordenado en el índice " + i);
        }
    }
}