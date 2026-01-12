package com.pensando.capitulo12;

import com.pensando.capitulo11.Carta;
import java.util.Random;

public class Mazo {

    private Carta[] tarjetas;
    private Random random; // Generador de números aleatorios

    public Mazo() {
        this.tarjetas = new Carta[52];
        this.random = new Random();
        // TODO: Copiar aquí el código del constructor del Capítulo 11
        // para llenar el mazo con las 52 cartas ordenadas.
        // (palo de 0 a 3, valor de 1 a 13).
    }

    /**
     * Helper: Intercambia las cartas en las posiciones i y j.
     * Es fundamental para mezclar y ordenar.
     */
    private void intercambiar(int i, int j) {
        // TODO:
        // 1. Guardar tarjetas[i] en una variable temporal 'temp'.
        // 2. Asignar tarjetas[j] a tarjetas[i].
        // 3. Asignar 'temp' a tarjetas[j].
    }

    /**
     * Ejercicio 12.1: Mezclar el mazo (Shuffle).
     * Algoritmo sugerido: Recorrer el mazo y para cada carta,
     * intercambiarla con otra posición aleatoria.
     */
    public void mezclar() {
        // TODO:
        // 1. Recorrer el arreglo desde i=0 hasta tarjetas.length - 1.
        // 2. Generar un entero aleatorio 'k' entre i y tarjetas.length (usando this.random.nextInt).
        //    (O simplemente entre 0 y 51, pero la técnica de Knuth es mejor entre i y length).
        // 3. Llamar a intercambiar(i, k).
    }

    /**
     * Helper para ordenamiento: Encuentra el índice de la carta más baja
     * en el rango desde 'inicio' hasta el final.
     */
    private int indiceDelMenor(int inicio) {
        // TODO:
        // 1. Asumir que el menor está en 'inicio'.
        // 2. Recorrer desde j = inicio + 1 hasta el final.
        // 3. Si tarjetas[j].compararCon(tarjetas[menor]) < 0 :
        //    Actualizar 'menor' con 'j'.
        // 4. Retornar el índice 'menor'.
        return -1;
    }

    /**
     * Ejercicio 12.2: Ordenamiento por Selección (Selection Sort).
     * Ordena el mazo de menor a mayor.
     */
    public void ordenar() {
        // TODO:
        // 1. Recorrer el mazo desde i=0 hasta length - 1.
        // 2. Encontrar el índice de la carta más pequeña desde i: int menor = indiceDelMenor(i);
        // 3. Llamar a intercambiar(i, menor).
    }

    // Método auxiliar para tests
    public Carta obtenerCarta(int i) {
        return tarjetas[i];
    }
}