package com.pensando.capitulo03;

/**
 * Ejercicio 3.1: Métodos y Parámetros (Zool)
 * Objetivo: Escribir un método que reciba 3 parámetros de distintos tipos
 * y entender cómo se pasan los datos.
 */
public class Ejercicio3_1_Zool {

    public Ejercicio3_1_Zool() {
    }

    /**
     * Actividad: Escribir un método llamado 'zool'.
     * El libro pide que reciba 3 parámetros: un entero y dos Strings.
     * Ejemplo de uso sugerido: zool(11, "Mascota", "Calle")
     * * @param numero Un valor entero.
     * @param mascota El nombre de la primera mascota.
     * @param calle El nombre de la calle donde creciste.
     * @return Para poder testearlo, devolveremos una frase concatenada.
     */
    public String zool(int numero, String mascota, String calle) {
        // TODO: Concatenar los parámetros en una frase.
        // Ejemplo esperado: "Numero: 11, Mascota: Firulais, Calle: Siempreviva"
        return "Numero: "+numero+", Mascota: "+mascota+", Calle: "+calle;
    }
}