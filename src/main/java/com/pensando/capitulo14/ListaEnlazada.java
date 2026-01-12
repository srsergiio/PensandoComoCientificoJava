package com.pensando.capitulo14;

/**
 * Ejercicios del Capítulo 14.
 * Una lista enlazada es simplemente una referencia al primer nodo (la cabeza).
 */
public class ListaEnlazada {

    private Nodo cabeza;

    /**
     * Constructor: Crea una lista vacía.
     */
    public ListaEnlazada() {
        this.cabeza = null;
    }

    /**
     * Ejercicio: Agregar un elemento al principio de la lista.
     * Es la operación más rápida en una lista enlazada (O(1)).
     */
    public void agregarAlPrincipio(int valor) {
        // TODO:
        // 1. Crear un nuevo nodo: new Nodo(valor, this.cabeza).
        //    (El 'siguiente' del nuevo nodo pasa a ser la antigua cabeza).
        // 2. Actualizar this.cabeza para que apunte al nuevo nodo.
    }

    /**
     * Ejercicio: Agregar al final.
     * Requiere recorrer toda la lista hasta encontrar el último nodo.
     */
    public void agregarAlFinal(int valor) {
        // TODO:
        // 1. Si la lista está vacía (cabeza == null), llamar a agregarAlPrincipio.
        // 2. Si no, crear un nodo 'actual' que empiece en 'cabeza'.
        // 3. Usar un while (actual.siguiente != null) para avanzar.
        // 4. Al salir del while, 'actual' es el último nodo.
        // 5. Hacer actual.siguiente = new Nodo(valor, null).
    }

    /**
     * Ejercicio: Eliminar el primer nodo.
     * Devuelve el valor eliminado o -1 si estaba vacía.
     */
    public int eliminarPrimero() {
        // TODO:
        // 1. Si cabeza es null, retornar -1 (o lanzar excepción).
        // 2. Guardar el valor: int resultado = cabeza.carga.
        // 3. Mover la cabeza: cabeza = cabeza.siguiente.
        // 4. Retornar resultado.
        return -1;
    }

    /**
     * Ejercicio: Imprimir lista.
     * Devuelve un String con formato "(1, 2, 3)"
     */
    public String toString() {
        // TODO:
        // 1. Si está vacía, retornar "()".
        // 2. Usar StringBuilder o String acumulador. Empezar con "(".
        // 3. Recorrer con nodo 'actual'. Concatenar actual.carga.
        // 4. Si hay siguiente, agregar ", ".
        // 5. Al final cerrar con ")".
        return null;
    }

    /**
     * Ejercicio: Calcular tamaño (Iterativo o Recursivo).
     */
    public int tamano() {
        // TODO: Contar cuántos nodos hay recorriendo la lista.
        return 0;
    }
}