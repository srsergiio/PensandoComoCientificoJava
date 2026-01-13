package com.pensando.capitulo03;

/**
 * Ejercicio 3.2: Reutilización de código
 * Objetivo: Mover la lógica de formateo de fechas a métodos que reciben parámetros.
 */
public class Ejercicio3_2_ImpresoraFecha {

    /**
     * Actividad: Crear método 'imprimirAmericano' que reciba los datos como parámetros.
     * Ya no usa variables de instancia, sino lo que le llega entre paréntesis.
     */
    public String imprimirAmericano(String dia, int fecha, String mes, int anio) {
        // TODO: Retornar formato "dia, mes fecha, anio"
        return  dia+", "+mes+" "+fecha+", "+anio;
    }

    /**
     * Actividad: Crear método 'imprimirEuropeo' que reciba los datos como parámetros.
     */
    public String imprimirEuropeo(String dia, int fecha, String mes, int anio) {
        // TODO: Retornar formato "dia fecha mes anio"
        return dia+" "+fecha+" "+mes+" "+anio;
    }
}