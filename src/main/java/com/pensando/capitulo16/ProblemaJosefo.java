package com.pensando.capitulo16;

import java.util.LinkedList;
import java.util.Queue;

public class ProblemaJosefo {

    /**
     * Resuelve quién es el sobreviviente.
     * @param n Cantidad de personas (1 a n).
     * @param k El paso del conteo (se elimina al k-ésimo).
     * @return El número de la persona que sobrevive.
     */
    public int sobreviviente(int n, int k) {
        Queue<Integer> cola = new LinkedList<>();

        // TODO:
        // 1. Llenar la cola con números del 1 al n.

        // 2. Mientras queden más de 1 persona (cola.size() > 1):
        //    a. Rotar k-1 veces:
        //       Sacar del frente (poll) y volver a meter atrás (add).
        //       (Esto simula que "se salvan" y pasa el turno).
        //    b. Eliminar al k-ésimo:
        //       Hacer un poll() y NO volver a meterlo (esta persona sale del juego).

        // 3. Retornar el único elemento que queda: cola.poll().
        return 0;
    }
}