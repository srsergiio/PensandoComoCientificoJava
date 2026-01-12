package com.pensando.capitulo14;

/**
 * El bloque constructivo de una lista enlazada.
 * Cada nodo contiene un dato (int) y una referencia al siguiente nodo.
 */
public class Nodo {

    // Atributos publicos para simplificar la manipulación directa en este capítulo
    // (El libro suele hacerlo así al principio para enseñar la mecánica)
    public int carga;
    public Nodo siguiente;

    /**
     * Constructor base.
     * @param carga El valor numérico a guardar.
     * @param siguiente El nodo que le sigue (o null si es el último).
     */
    public Nodo(int carga, Nodo siguiente) {
        this.carga = carga;
        this.siguiente = siguiente;
    }

    /**
     * Representación en texto.
     * Solo muestra el valor de ESTE nodo, no de toda la lista.
     */
    public String toString() {
        return Integer.toString(carga);
    }
}