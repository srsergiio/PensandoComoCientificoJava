package com.pensando.capitulo18;

import java.util.ArrayList;

/**
 * Implementación de un Max-Heap (La raíz siempre es el mayor).
 * Se implementa sobre un ArrayList, mapeando índices de padre a hijos.
 */
public class Monticulo {

    private ArrayList<Integer> lista;

    public Monticulo() {
        this.lista = new ArrayList<>();
    }

    /**
     * Agrega un valor y lo hace "flotar" hasta su posición correcta.
     */
    public void agregar(int valor) {
        // 1. Añadir al final.
        lista.add(valor);
        // 2. Flotar el nuevo elemento (que está en el último índice).
        flotar(lista.size() - 1);
    }

    /**
     * Elimina y devuelve el valor máximo (la raíz).
     */
    public int eliminarMax() {
        if (lista.isEmpty()) {
            throw new IllegalStateException("El montículo está vacío");
        }

        // 1. Guardar el valor de la raíz (índice 0).
        int max = lista.get(0);

        // 2. Mover el último elemento a la raíz (para tapar el hueco).
        int ultimoElemento = lista.remove(lista.size() - 1);

        if (!lista.isEmpty()) {
            lista.set(0, ultimoElemento);
            // 3. Hundir la nueva raíz hasta que encuentre su lugar.
            hundir(0);
        }

        return max;
    }

    public boolean estaVacio() {
        return lista.isEmpty();
    }

    public int tamano() {
        return lista.size();
    }

    /**
     * Helper: Mueve un elemento hacia arriba si es mayor que su padre.
     * Fórmulas:
     * Padre de i = (i - 1) / 2
     */
    private void flotar(int indice) {
        // TODO:
        // 1. Mientras indice > 0:
        //    a. Calcular indicePadre = (indice - 1) / 2.
        //    b. Si lista.get(indice) > lista.get(indicePadre):
        //       - Intercambiar valores.
        //       - Actualizar indice = indicePadre.
        //    c. Si no (el padre es mayor), terminar (break).
    }

    /**
     * Helper: Mueve un elemento hacia abajo si es menor que sus hijos.
     * Fórmulas:
     * Hijo Izq = 2*i + 1
     * Hijo Der = 2*i + 2
     */
    private void hundir(int indice) {
        // TODO:
        // 1. Bucle infinito (o hasta no tener hijos).
        // 2. Calcular indices de hijos: izq y der.
        // 3. Encontrar cuál es el mayor entre (yo, hijoIzq, hijoDer).
        //    (Cuidado con verificar si los hijos existen dentro del tamaño de la lista).
        // 4. Si el mayor soy yo -> Terminé (break).
        // 5. Si el mayor es un hijo -> Intercambiar con ese hijo y actualizar indice.
    }

    // Método auxiliar para intercambiar dos valores en el ArrayList
    private void intercambiar(int i, int j) {
        int temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }
}