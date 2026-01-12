package com.pensando.capitulo20;

/**
 * Nodo del árbol de Huffman.
 * Implementa Comparable para que la PriorityQueue los ordene automáticamente por frecuencia.
 */
public class NodoHuffman implements Comparable<NodoHuffman> {

    public char caracter;      // La letra (solo para hojas)
    public int frecuencia;     // Cuántas veces aparece
    public NodoHuffman izquierda;
    public NodoHuffman derecha;

    /**
     * Constructor para nodos hoja (tienen letra y frecuencia).
     */
    public NodoHuffman(char caracter, int frecuencia) {
        this.caracter = caracter;
        this.frecuencia = frecuencia;
    }

    /**
     * Constructor para nodos internos (no tienen letra, suman frecuencias de hijos).
     */
    public NodoHuffman(NodoHuffman izquierda, NodoHuffman derecha) {
        this.caracter = '\0'; // Caracter nulo (no importa)
        this.frecuencia = izquierda.frecuencia + derecha.frecuencia;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public boolean esHoja() {
        return izquierda == null && derecha == null;
    }

    /**
     * Esto le dice a la Cola de Prioridad: "Soy menor si mi frecuencia es menor".
     */
    @Override
    public int compareTo(NodoHuffman otro) {
        return this.frecuencia - otro.frecuencia;
    }
}