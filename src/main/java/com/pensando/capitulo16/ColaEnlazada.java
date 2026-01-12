package com.pensando.capitulo16;

import com.pensando.capitulo14.Nodo;

/**
 * Implementación propia de una Cola (Queue).
 * Mantiene punteros al primero y al último para eficiencia.
 */
public class ColaEnlazada {

    private Nodo primero; // Por donde salen (cabeza)
    private Nodo ultimo;  // Por donde entran (cola)
    private int cantidad;

    public ColaEnlazada() {
        this.primero = null;
        this.ultimo = null;
        this.cantidad = 0;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    /**
     * Agrega un elemento al final de la cola (Encolar / Offer).
     */
    public void encolar(int valor) {
        // TODO:
        // 1. Crear nuevo nodo: Nodo nuevo = new Nodo(valor, null);
        // 2. Si la cola está vacía:
        //      primero = nuevo;
        //      ultimo = nuevo;
        // 3. Si no está vacía:
        //      ultimo.siguiente = nuevo; // El que era último apunta al nuevo
        //      ultimo = nuevo;           // El nuevo pasa a ser el último
        // 4. Incrementar cantidad.
    }

    /**
     * Saca el elemento del frente (Desencolar / Poll).
     * @return El valor sacado o -1 si está vacía.
     */
    public int desencolar() {
        // TODO:
        // 1. Si está vacía, lanzar excepción o retornar -1.
        // 2. Guardar valor: int resultado = primero.carga;
        // 3. Mover primero: primero = primero.siguiente;
        // 4. Si primero se vuelve null (la cola quedó vacía), hacer ultimo = null.
        // 5. Decrementar cantidad.
        // 6. Retornar resultado.
        return -1;
    }

    public int tamano() {
        return cantidad;
    }
}