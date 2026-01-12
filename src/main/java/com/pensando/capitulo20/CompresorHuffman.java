package com.pensando.capitulo20;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CompresorHuffman {

    /**
     * Paso 1: Construir el Árbol de Huffman.
     * Algoritmo:
     * 1. Contar frecuencias.
     * 2. Crear nodos hoja y meterlos a la Cola de Prioridad.
     * 3. Mientras quede más de 1 nodo en la cola:
     * - Sacar los dos menores (poll).
     * - Combinarlos en un nuevo padre.
     * - Meter el padre a la cola.
     * 4. El último que queda es la raíz.
     */
    public NodoHuffman construirArbol(String texto) {
        // A. Contar frecuencias (Como en el Cap 19)
        Map<Character, Integer> conteo = new HashMap<>();
        for (char c : texto.toCharArray()) {
            conteo.put(c, conteo.getOrDefault(c, 0) + 1);
        }

        // B. Llenar la Cola de Prioridad
        PriorityQueue<NodoHuffman> cola = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : conteo.entrySet()) {
            cola.add(new NodoHuffman(entry.getKey(), entry.getValue()));
        }

        // C. Construir el árbol (combinar nodos)
        // TODO:
        // Mientras (cola.size() > 1):
        // 1. NodoHuffman izq = cola.poll();
        // 2. NodoHuffman der = cola.poll();
        // 3. NodoHuffman padre = new NodoHuffman(izq, der);
        // 4. cola.add(padre);

        // Retornar la raíz (o null si estaba vacía)
        return cola.poll();
    }

    /**
     * Paso 2: Generar la tabla de códigos (ej: 'a'->"0", 'b'->"101").
     * Recorre el árbol recursivamente: izquierda='0', derecha='1'.
     */
    public Map<Character, String> generarCodigos(NodoHuffman raiz) {
        Map<Character, String> codigos = new HashMap<>();
        generarCodigosRecursivo(raiz, "", codigos);
        return codigos;
    }

    private void generarCodigosRecursivo(NodoHuffman nodo, String codigoActual, Map<Character, String> mapa) {
        // TODO:
        // Caso Base: Si nodo es null, return.
        // Caso Hoja: Si nodo.esHoja(), guardar en mapa (nodo.caracter, codigoActual).

        // Caso Recursivo:
        // Llamar con (nodo.izquierda, codigoActual + "0", mapa)
        // Llamar con (nodo.derecha, codigoActual + "1", mapa)
    }

    /**
     * Paso 3: Codificar el texto a binario (String de 0s y 1s).
     */
    public String codificar(String texto, Map<Character, String> codigos) {
        StringBuilder sb = new StringBuilder();
        // TODO: Recorrer el texto char por char, buscar su código en el mapa y concatenar al sb.
        return sb.toString();
    }

    /**
     * Paso 4: Decodificar (Binario -> Texto original).
     * Recorremos el árbol: '0' vamos a izquierda, '1' a derecha.
     * Al llegar a una hoja, escribimos la letra y volvemos a la raíz.
     */
    public String decodificar(String binario, NodoHuffman raiz) {
        StringBuilder resultado = new StringBuilder();
        NodoHuffman actual = raiz;

        for (char bit : binario.toCharArray()) {
            // TODO:
            // 1. Si bit es '0', actual = actual.izquierda.
            // 2. Si bit es '1', actual = actual.derecha.

            // 3. Si actual.esHoja():
            //    - Concatenar actual.caracter a resultado.
            //    - Reiniciar actual = raiz (para la siguiente letra).
        }
        return resultado.toString();
    }
}