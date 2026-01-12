package com.pensando.capitulo17;

/**
 * Árbol Binario de enteros.
 * Definición recursiva: Un árbol se compone de un dato y referencias a otros dos árboles.
 */
public class Arbol {

    private int carga;
    private Arbol izquierdo;
    private Arbol derecho;

    /**
     * Constructor completo.
     * @param carga Valor del nodo.
     * @param izquierdo Sub-árbol izquierdo (o null).
     * @param derecho Sub-árbol derecho (o null).
     */
    public Arbol(int carga, Arbol izquierdo, Arbol derecho) {
        this.carga = carga;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    /**
     * Constructor simple (Hoja).
     */
    public Arbol(int carga) {
        this(carga, null, null);
    }

    /**
     * Recorrido Pre-Orden (Pre-Order).
     * Orden: Raíz -> Izquierda -> Derecha.
     * Útil para copiar el árbol.
     * @return String con los valores separados por espacio.
     */
    public String obtenerPreOrden() {
        // TODO:
        // 1. Convertir mi carga a String.
        // 2. Si tengo izquierdo: concatenar " " + izquierdo.obtenerPreOrden().
        // 3. Si tengo derecho: concatenar " " + derecho.obtenerPreOrden().
        // 4. Retornar el resultado.
        return "";
    }

    /**
     * Recorrido In-Orden (In-Order).
     * Orden: Izquierda -> Raíz -> Derecha.
     * ¡Truco! Si el árbol es de búsqueda, esto devuelve los números ordenados.
     */
    public String obtenerInOrden() {
        // TODO:
        // 1. String resultado = "";
        // 2. Si izquierdo != null -> resultado += izquierdo.obtenerInOrden() + " ";
        // 3. resultado += carga;
        // 4. Si derecho != null -> resultado += " " + derecho.obtenerInOrden();
        // 5. Retornar resultado.
        return "";
    }

    /**
     * Recorrido Post-Orden (Post-Order).
     * Orden: Izquierda -> Derecha -> Raíz.
     * Útil para eliminar el árbol o evaluar expresiones matemáticas.
     */
    public String obtenerPostOrden() {
        // TODO:
        // Similar a los anteriores pero: Izq + Der + Raíz.
        return "";
    }

    /**
     * Calcula la altura del árbol (la rama más larga).
     */
    public int altura() {
        // TODO:
        // 1. Si soy una hoja (izq==null y der==null) -> return 0 (o 1, según convención).
        // 2. Calcular alturaIzq = (izquierdo == null) ? -1 : izquierdo.altura();
        // 3. Calcular alturaDer = (derecho == null) ? -1 : derecho.altura();
        // 4. Retornar 1 + Math.max(alturaIzq, alturaDer);
        return 0;
    }
}