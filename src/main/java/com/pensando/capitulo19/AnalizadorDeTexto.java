package com.pensando.capitulo19;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Ejercicios del Capítulo 19: Mapas.
 * Objetivo: Usar un HashMap para contar frecuencias de palabras eficientemente.
 */
public class AnalizadorDeTexto {

    /**
     * Cuenta la frecuencia de cada palabra en un texto.
     * @param texto El texto a analizar.
     * @return Un Mapa donde la Clave es la palabra (String) y el Valor es la cantidad (Integer).
     */
    public Map<String, Integer> contarPalabras(String texto) {
        // Creamos el mapa vacío
        Map<String, Integer> frecuencias = new HashMap<>();

        // Usamos StringTokenizer para separar por espacios (o split)
        // Normalizamos a minúsculas para que "Hola" y "hola" cuenten igual.
        StringTokenizer tokens = new StringTokenizer(texto.toLowerCase());

        while (tokens.hasMoreTokens()) {
            String palabra = tokens.nextToken();

            // TODO:
            // 1. Verificar si la palabra ya está en el mapa:
            //    if (frecuencias.containsKey(palabra)) { ... }
            //
            // 2. Si YA está:
            //    Obtener la cuenta actual: int cuenta = frecuencias.get(palabra);
            //    Guardar la cuenta + 1: frecuencias.put(palabra, cuenta + 1);
            //
            // 3. Si NO está:
            //    Guardarla con valor 1: frecuencias.put(palabra, 1);

            // CONSEJO PRO (Java 8+):
            // Todo el bloque if/else se puede reemplazar con una sola línea:
            // frecuencias.put(palabra, frecuencias.getOrDefault(palabra, 0) + 1);
        }

        return frecuencias;
    }

    /**
     * Ejercicio extra: Invertir el mapa.
     * Dado un mapa de Estudiante -> Nota, crear un mapa de Nota -> Lista de Estudiantes.
     * (Esto demuestra que los valores pueden ser listas).
     */
    // Este lo dejaremos planteado conceptualmente, pero céntrate primero en contarPalabras.
}