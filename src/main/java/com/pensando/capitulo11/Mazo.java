package com.pensando.capitulo11;

public class Mazo {

    private Carta[] tarjetas;

    /**
     * Constructor: Crea un mazo estándar de 52 cartas ordenadas.
     */
    public Mazo() {
        this.tarjetas = new Carta[52];
        int index = 0;

        // TODO: Llenar el mazo.
        // Bucle para cada palo (0 a 3):
        //   Bucle para cada valor (1 a 13):
        //     this.tarjetas[index] = new Carta(palo, valor);
        //     index++;
    }

    /**
     * Busca una carta específica en el mazo.
     * Retorna el índice o -1 si no está.
     */
    public int buscar(Carta carta) {
        // TODO: Recorrer this.tarjetas y usar equals() para encontrarla.
        return -1;
    }

    /**
     * Devuelve una carta en una posición específica.
     * Útil para los tests.
     */
    public Carta obtenerCarta(int i) {
        return this.tarjetas[i];
    }
}