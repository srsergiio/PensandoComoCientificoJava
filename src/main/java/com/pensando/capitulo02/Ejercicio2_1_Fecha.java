package com.pensando.capitulo02;

/**
 * Ejercicio 2.1 del libro.
 * Objetivo: Crear variables para día, mes, año y mostrar la fecha en distintos formatos.
 */
public class Ejercicio2_1_Fecha {

    // TODO: Declarar aquí las variables de instancia (diaSemana, diaMes, mes, anio)
    // Ejemplo: private String diaSemana;
    private String diaSemana,mes;
    private int diaMes, anio;

    public Ejercicio2_1_Fecha(String diaSemana, int diaMes, String mes, int anio) {
        // TODO: Asignar los valores recibidos a las variables de instancia
       this.diaSemana = diaSemana;
        this.diaMes = diaMes;
        this.mes = mes;
        this.anio = anio;

    }

    /**
     * Actividad: Retornar la fecha en formato argentino.
     * Ejemplo esperado: "Lunes 9 de agosto de 2010"
     */
    public String obtenerFormatoArgentino() {
        // TODO: Construir y retornar el String concatenando las variables

        return this.diaSemana+" "+this.diaMes+" de "+this.mes+" de "+this.anio;
    }

    /**
     * Actividad: Retornar la fecha en formato americano.
     * Ejemplo esperado: "Lunes, agosto 9, 2010"
     */
    public String obtenerFormatoAmericano() {
        // TODO: Construir y retornar el String en formato americano
        return this.diaSemana+", "+this.mes+" "+this.diaMes+", "+this.anio;
    }

    /**
     * Actividad: Retornar la fecha en formato europeo.
     * Ejemplo esperado: "Lunes 9 agosto, 2010"
     */
    public String obtenerFormatoEuropeo() {
        // TODO: Construir y retornar el String en formato europeo
        return this.diaSemana+" "+this.diaMes+" "+this.mes+", "+this.anio;
    }
}