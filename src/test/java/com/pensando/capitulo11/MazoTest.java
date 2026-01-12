package com.pensando.capitulo11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MazoTest {

    @Test
    public void testCartaToString() {
        // 0=Tréboles, 11=Jota
        Carta carta = new Carta(0, 11);

        // Dependiendo de tu lógica en toString, ajusta el esperado
        assertEquals("Jota de Tréboles", carta.toString());

        // 2=Corazones, 1=As
        Carta as = new Carta(2, 1);
        assertEquals("As de Corazones", as.toString());
    }

    @Test
    public void testComparar() {
        Carta c1 = new Carta(0, 5); // 5 de Tréboles
        Carta c2 = new Carta(0, 10); // 10 de Tréboles
        Carta c3 = new Carta(1, 2); // 2 de Diamantes

        // Mismo palo, c2 es mayor
        assertEquals(-1, c1.compararCon(c2));
        assertEquals(1, c2.compararCon(c1));

        // Distinto palo, c3 (Diamantes=1) es mayor que c1 (Tréboles=0)
        assertEquals(-1, c1.compararCon(c3));

        // Iguales
        assertEquals(0, c1.compararCon(new Carta(0, 5)));
    }

    @Test
    public void testMazoCreado() {
        Mazo mazo = new Mazo();

        // Verificar la primera carta (Tréboles, As)
        Carta primera = mazo.obtenerCarta(0);
        assertEquals("As de Tréboles", primera.toString());

        // Verificar la última carta (posición 51)
        // Debería ser Rey de Picas (Palo 3, Valor 13)
        Carta ultima = mazo.obtenerCarta(51);
        assertEquals("Rey de Picas", ultima.toString());
    }

    @Test
    public void testBuscarEnMazo() {
        Mazo mazo = new Mazo();
        Carta buscada = new Carta(2, 12); // Reina de Corazones (Palo 2, Valor 12)

        // El índice debería ser:
        // Palo 0 (13 cartas) + Palo 1 (13 cartas) + en Palo 2 es la 12va carta (índice 11 local)
        // Total esperado: 13 + 13 + 11 = 37 (aprox, depende de tu bucle)
        int indice = mazo.buscar(buscada);

        assertTrue(indice >= 0, "Debería encontrar la carta");
        assertTrue(mazo.obtenerCarta(indice).equals(buscada), "La carta encontrada debe coincidir");
    }
}